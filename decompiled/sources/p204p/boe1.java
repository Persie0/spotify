package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX INFO: loaded from: classes11.dex */
public enum boe1 implements od50 {
    ALBUM(0),
    ARTIST(1),
    PLAYLIST(2),
    SHOW(3),
    BOOK(4),
    EVENT(5),
    AUTHOR(7),
    DOWNLOADED(100),
    WRITABLE(101),
    BY_YOU(102),
    BY_SPOTIFY(103),
    UNPLAYED(104),
    IN_PROGRESS(105),
    FINISHED(Error.INVALID_COUNTRY_FIELD_NUMBER),
    IS_MIXED(Error.TOO_YOUNG_FIELD_NUMBER),
    UPCOMING(108),
    VENUE(109),
    PAST(110),
    FOLDER(ContentType.SHORT_FORM_ON_DEMAND),
    PUBLISHED(ContentType.LONG_FORM_ON_DEMAND),
    PUBLISHABLE(ContentType.LIVE),
    BY_OTHERS(114),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f29122a;

    boe1(int i) {
        this.f29122a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29122a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
