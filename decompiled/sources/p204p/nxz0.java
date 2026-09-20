package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nxz0 {

    /* JADX INFO: renamed from: b */
    public static final nxz0 f159651b = new nxz0(new HashSet());

    /* JADX INFO: renamed from: c */
    public static final String f159652c;

    /* JADX INFO: renamed from: a */
    public final hg40 f159653a;

    static {
        String str = h0b1.f86200a;
        f159652c = Integer.toString(0, 36);
    }

    public nxz0(HashSet hashSet) {
        this.f159653a = hg40.m47406p(hashSet);
    }

    /* JADX INFO: renamed from: b */
    public static nxz0 m65865b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f159652c);
        if (parcelableArrayList == null) {
            yif1.m93819w0("Missing commands. Creating an empty SessionCommands");
            return f159651b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(mxz0.m63117a((Bundle) parcelableArrayList.get(i)));
        }
        return new nxz0(hashSet);
    }

    /* JADX INFO: renamed from: a */
    public final gjs0 m65866a() {
        return new gjs0(this);
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m65867c() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        o3a1 it = this.f159653a.iterator();
        while (it.hasNext()) {
            arrayList.add(((mxz0) it.next()).m63118b());
        }
        bundle.putParcelableArrayList(f159652c, arrayList);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nxz0) {
            return this.f159653a.equals(((nxz0) obj).f159653a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f159653a);
    }
}
