package com.botob.ulisten2.media.impl;

import android.os.Parcel;

import com.botob.ulisten2.media.AbstractMedia;
import com.botob.ulisten2.media.MediaApp;
import com.botob.ulisten2.notification.NotificationData;

/**
 * GooglePlayMusicMedia is the class extending AbstractMedia responsible for extracting the media information
 * from the Google Play Music notifications.
 *
 * @author boriguen
 * @date 10/16/16
 */
public class GooglePlayMusicMedia extends AbstractMedia {

    public GooglePlayMusicMedia(NotificationData notificationData) {
        super(notificationData);
    }

    public GooglePlayMusicMedia(final Parcel parcel) {
        super(parcel);
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(MediaApp.GOOGLE_PLAY_MUSIC.name());
        super.writeToParcel(out, flags);
    }

    @Override
    protected String fetchTitle(NotificationData notificationData) {
        return notificationData.titleText.toString();
    }

    @Override
    protected String fetchAlbum(NotificationData notificationData) {
        return notificationData.subText.toString();
    }

    @Override
    protected String fetchArtist(NotificationData notificationData) {
        return notificationData.messageText.toString();
    }
}
