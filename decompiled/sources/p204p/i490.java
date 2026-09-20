package p204p;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i490 implements Parcelable {
    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final String m49665h() {
        String strM38564m = "name";
        if (!(this instanceof z390) && !(this instanceof a490)) {
            if (this instanceof v390) {
                strM38564m = "custom";
            } else if (this instanceof n390) {
                strM38564m = "addTime";
            } else if (this instanceof p390) {
                strM38564m = "addedBy";
            } else if (this instanceof y390) {
                strM38564m = "duration";
            } else if (this instanceof g490) {
                strM38564m = "show.name";
            } else {
                strM38564m = "album.name";
                if (!(this instanceof r390)) {
                    if (this instanceof t390) {
                        strM38564m = "artist.name";
                    } else if (this instanceof w390) {
                        strM38564m = "disc.number";
                    } else if (!(this instanceof s390)) {
                        if (this instanceof e490) {
                            strM38564m = "publishDate";
                        } else if (this instanceof h490) {
                            strM38564m = "track.number";
                        } else if (this instanceof u390) {
                            strM38564m = "artist.name";
                        } else if (this instanceof q390) {
                            strM38564m = "album.artist.name";
                        } else if (this instanceof o390) {
                            strM38564m = "addTime.reversed";
                        } else if (this instanceof b490) {
                            strM38564m = edb.m38564m("provided.", ((b490) this).mo28079g());
                        } else {
                            if (!(this instanceof c490)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strM38564m = edb.m38564m("providedNonReversible.", ((c490) this).mo28079g());
                        }
                    }
                }
            }
        }
        return ((this instanceof f490) && ((f490) this).mo28078c()) ? s571.m77250i(strM38564m, ".reversed") : strM38564m;
    }
}
