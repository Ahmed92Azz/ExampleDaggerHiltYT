package com.letspracticeskills.ahmedezzulddin.exampledaggerhiltyt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("firstName")
    fun provideGetFirstName(@ApplicationContext context: Context): String{
        return context.getString(R.string.firstName)
    }

}











