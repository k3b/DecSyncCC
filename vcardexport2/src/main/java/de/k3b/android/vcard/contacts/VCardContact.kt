package de.k3b.android.vcard.contacts

import android.content.ContentValues
import at.bitfire.vcard4android.AndroidAddressBook
import at.bitfire.vcard4android.AndroidContact
import at.bitfire.vcard4android.AndroidContactFactory
import at.bitfire.vcard4android.Contact

class VCardContact  : AndroidContact {
    constructor(addressBook: AndroidAddressBook<VCardContact, *>, values: ContentValues) : super(addressBook, values)
    constructor(addressBook: AndroidAddressBook<VCardContact, *>, contact: Contact, uid: String, bookId: String) : super(addressBook, contact, uid, bookId)

    object ContactFactory: AndroidContactFactory<VCardContact> {
        override fun fromProvider(addressBook: AndroidAddressBook<VCardContact, *>, values: ContentValues) =
            VCardContact(addressBook, values)
    }

}