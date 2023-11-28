package de.k3b.android.vcard

import android.accounts.Account
import android.content.ContentProviderClient
import at.bitfire.vcard4android.AndroidAddressBook
import at.bitfire.vcard4android.Contact
import de.k3b.android.vcard.contacts.VCardContact
import de.k3b.android.vcard.contacts.VCardGroup

class Exporter(account : Account, provider: ContentProviderClient) {
    val addressBook = AndroidAddressBook(account, provider,
        VCardContact.ContactFactory, VCardGroup.GroupFactory)

    fun queryContacts(): List<Contact> {
        return addressBook.queryContacts(null,null).map {  c -> c.getContact() }
    }

    fun queryGroups(): List<Contact> {
        return addressBook.queryGroups(null,null).map { c -> c.getContact() }
    }
}