package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class j6y implements Parcelable {
    public static final Parcelable.Creator<j6y> CREATOR = new wfw(17);

    /* JADX INFO: renamed from: a */
    public final String f109421a;

    /* JADX INFO: renamed from: b */
    public final String f109422b;

    /* JADX INFO: renamed from: c */
    public final String f109423c;

    /* JADX INFO: renamed from: d */
    public i6y f109424d;

    /* JADX INFO: renamed from: e */
    public boolean f109425e;

    /* JADX INFO: renamed from: f */
    public final transient WeakHashMap f109426f = new WeakHashMap(1);

    public j6y(String str, String str2, String str3, i6y i6yVar) {
        this.f109421a = str;
        this.f109422b = str2;
        this.f109423c = str3;
        this.f109424d = i6yVar;
    }

    /* JADX INFO: renamed from: c */
    public static j6y m52590c(j6y j6yVar, i6y i6yVar) {
        String str = j6yVar.f109421a;
        String str2 = j6yVar.f109422b;
        String str3 = j6yVar.f109423c;
        j6yVar.getClass();
        return new j6y(str, str2, str3, i6yVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6y)) {
            return false;
        }
        j6y j6yVar = (j6y) obj;
        return wj50.m88271j(this.f109421a, j6yVar.f109421a) && wj50.m88271j(this.f109422b, j6yVar.f109422b) && wj50.m88271j(this.f109423c, j6yVar.f109423c) && wj50.m88271j(this.f109424d, j6yVar.f109424d);
    }

    /* JADX INFO: renamed from: g */
    public final int m52591g(Context context) {
        i6y i6yVar = this.f109424d;
        if (i6yVar instanceof g6y) {
            return context.getColor(((g6y) i6yVar).f77140a);
        }
        return i6yVar instanceof h6y ? ((h6y) i6yVar).f88293a : context.getColor(R.color.encore_face_pile_symbol_bg);
    }

    public final String getUsername() {
        return this.f109422b;
    }

    /* JADX INFO: renamed from: h */
    public final i6y m52592h() {
        return this.f109424d;
    }

    public final int hashCode() {
        String str = this.f109421a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f109422b);
        String str2 = this.f109423c;
        int iHashCode = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        i6y i6yVar = this.f109424d;
        return iHashCode + (i6yVar != null ? i6yVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j */
    public final String m52593j() {
        return this.f109423c;
    }

    /* JADX INFO: renamed from: k */
    public final String m52594k() {
        return this.f109421a;
    }

    /* JADX INFO: renamed from: l */
    public final Drawable m52595l(Context context) {
        WeakHashMap weakHashMap = this.f109426f;
        Object z8yVar = weakHashMap.get(context);
        if (z8yVar == null) {
            boolean z = this.f109425e;
            String str = this.f109423c;
            String str2 = this.f109422b;
            if (z) {
                int iM52591g = m52591g(context);
                StringBuilder sbM38573v = edb.m38573v("Username: ", str2, ", displayName: ", str, ", Color: ");
                sbM38573v.append(iM52591g);
                Logger.m3966b(sbM38573v.toString(), new Object[0]);
                z8yVar = new z8y(iM52591g, context, str2);
            } else {
                z8yVar = new z8y(context, str2, str, this.f109424d != null ? Integer.valueOf(m52591g(context)) : null);
            }
            weakHashMap.put(context, z8yVar);
        }
        return (Drawable) z8yVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109421a);
        parcel.writeString(this.f109422b);
        parcel.writeString(this.f109423c);
        parcel.writeParcelable(this.f109424d, i);
    }
}
