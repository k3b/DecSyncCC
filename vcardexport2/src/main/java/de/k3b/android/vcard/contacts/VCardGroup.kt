package de.k3b.android.vcard.contacts

import android.content.ContentValues
import at.bitfire.vcard4android.AndroidAddressBook
import at.bitfire.vcard4android.AndroidContact
import at.bitfire.vcard4android.AndroidGroup
import at.bitfire.vcard4android.AndroidGroupFactory
import at.bitfire.vcard4android.Contact

class VCardGroup : AndroidGroup {
    constructor(addressBook: AndroidAddressBook<*, VCardGroup>, values: ContentValues) : super(addressBook, values)
    constructor(addressBook: AndroidAddressBook<*, VCardGroup>, contact: Contact, uid: String, bookId: String) : super(addressBook, contact, uid, bookId)

    object GroupFactory: AndroidGroupFactory<VCardGroup> {
        override fun fromProvider(addressBook: AndroidAddressBook<out AndroidContact, VCardGroup>, values: ContentValues) =
            VCardGroup(addressBook, values)
    }
}