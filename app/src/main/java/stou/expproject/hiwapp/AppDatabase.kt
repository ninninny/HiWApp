package stou.expproject.hiwapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase


@Database(entities = [User::class, ReviewItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDAO
    abstract fun reviewDao(): ReviewDAO

    companion object{
        // For Singleton instantiation
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "hiw-database").build()
        }


    }

}


/*@Database(entities = [User::class], version = 1 )
abstract  class AppDatabase {
abstract  fun userDao() : UserDAO

companion object{

    @Volatile
    private var INSTANCE : AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase{

        val tempInstance = INSTANCE
        if(tempInstance != null){
            return tempInstance
        }
        synchronized(this){
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "app_database"
            ).build()
            INSTANCE = instance
            return instance
        }

    }

}

}*/