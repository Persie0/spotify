package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e8y implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final int f57304a;

    /* JADX INFO: renamed from: b */
    public final int f57305b;

    /* JADX INFO: renamed from: c */
    public final int f57306c;

    /* JADX INFO: renamed from: d */
    public final String f57307d;

    /* JADX INFO: renamed from: e */
    public final String f57308e;

    /* JADX INFO: renamed from: f */
    public final String f57309f;

    /* JADX INFO: renamed from: g */
    public final Object f57310g;

    /* JADX INFO: renamed from: h */
    public final String f57311h;

    /* JADX INFO: renamed from: i */
    public final FacebookException f57312i;

    /* JADX INFO: renamed from: t */
    public static final ti5 f57303t = new ti5(11);
    public static final Parcelable.Creator<e8y> CREATOR = new p7y(1);

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    public e8y(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z) {
        Set set;
        Set set2;
        Set set3;
        this.f57304a = i;
        this.f57305b = i2;
        this.f57306c = i3;
        this.f57307d = str;
        this.f57308e = str3;
        this.f57309f = str4;
        this.f57310g = obj;
        this.f57311h = str2;
        ti5 ti5Var = f57303t;
        int i4 = 2;
        if (facebookException != null) {
            this.f57312i = facebookException;
        } else {
            this.f57312i = new FacebookServiceException(this, m38132c());
            rb5 rb5VarM80912B = ti5Var.m80912B();
            Map map = (Map) rb5VarM80912B.f197472c;
            Map map2 = (Map) rb5VarM80912B.f197473d;
            Map map3 = (Map) rb5VarM80912B.f197471b;
            if (z) {
                i4 = 3;
            } else if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set3 = (Set) map3.get(Integer.valueOf(i2))) != null && !set3.contains(Integer.valueOf(i3)))) {
                if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = (Set) map2.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
                    i4 = 1;
                } else if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set = (Set) map.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
                    i4 = 3;
                }
            }
        }
        ti5Var.m80912B();
        int i5 = f8y.f67124a[edb.m38547C(i4)];
    }

    /* JADX INFO: renamed from: c */
    public final String m38132c() {
        String str = this.f57311h;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f57312i;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "{HttpStatus: " + this.f57304a + ", errorCode: " + this.f57305b + ", subErrorCode: " + this.f57306c + ", errorType: " + this.f57307d + ", errorMessage: " + m38132c() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f57304a);
        parcel.writeInt(this.f57305b);
        parcel.writeInt(this.f57306c);
        parcel.writeString(this.f57307d);
        parcel.writeString(m38132c());
        parcel.writeString(this.f57308e);
        parcel.writeString(this.f57309f);
    }

    public e8y(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public e8y(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, false);
    }
}
