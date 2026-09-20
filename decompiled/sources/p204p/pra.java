package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class pra implements Parcelable {
    public static final Parcelable.Creator<pra> CREATOR = new ora(0);

    /* JADX INFO: renamed from: a */
    public final Bundle f180537a;

    public pra(Object obj) {
        ArrayMap arrayMap = gsa.f83920a;
        String strM45635i = gsa.m45635i(obj.getClass());
        Log.isLoggable("CarApp.Bun", 3);
        this.f180537a = gsa.m45641o(obj, strM45635i, new esa(null, "", new ArrayDeque()));
    }

    /* JADX INFO: renamed from: c */
    public final Object m70706c() {
        ArrayMap arrayMap = gsa.f83920a;
        boolean zIsLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f180537a;
        if (zIsLoggable) {
        }
        return gsa.m45632f(bundle, new esa(null, "", new ArrayDeque()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f180537a);
    }

    public pra(Bundle bundle) {
        this.f180537a = bundle;
    }
}
