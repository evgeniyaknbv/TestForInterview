package com.alexandrovna.evgeniya.konobeeva.testforinterview.MediaBlock

import android.app.Service
import android.os.IBinder
import android.os.IBinder.DeathRecipient
import android.os.IInterface
import android.os.Parcel
import java.io.FileDescriptor

class MusicBinder(val service: Service): IBinder {
    override fun getInterfaceDescriptor(): String? {
        return null
    }

    override fun isBinderAlive(): Boolean {
        return false
    }

    override fun linkToDeath(recipient: DeathRecipient, flags: Int) {
    }

    override fun queryLocalInterface(descriptor: String): IInterface? {
        return null
    }

    override fun transact(code: Int, data: Parcel, reply: Parcel?, flags: Int): Boolean {
        return false
    }

    override fun dumpAsync(fd: FileDescriptor, args: Array<String>?) {
    }

    override fun dump(fd: FileDescriptor, args: Array<String>?) {
    }

    override fun unlinkToDeath(recipient: DeathRecipient, flags: Int): Boolean {
        return false
    }

    override fun pingBinder(): Boolean {
        return false
    }
}