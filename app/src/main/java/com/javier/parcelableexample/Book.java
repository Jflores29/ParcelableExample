package com.javier.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by User on 2/17/2017.
 */

public class Book implements Parcelable {
    private String bookname;
    private String author;
    private int publishTime;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
}

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }

    public static final Parcelable.Creator<Book> CREATOR = new Creator<Book>() {
        public Book createFromParcel(Parcel source) {
            Book mBook = new Book();
            mBook.bookname = source.readString();
            mBook.author = source.readString();
            mBook.publishTime = source.readInt();
            return mBook;
        }
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(bookname);
        dest.writeString(author);
        dest.writeInt(publishTime);

    }


}
