package p204p;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b7p0 {

    /* JADX INFO: renamed from: b */
    public static final b7p0 f24366b = new a7p0().m24990d();

    /* JADX INFO: renamed from: c */
    public static final String f24367c;

    /* JADX INFO: renamed from: a */
    public final kfz f24368a;

    static {
        String str = h0b1.f86200a;
        f24367c = Integer.toString(0, 36);
    }

    public b7p0(kfz kfzVar) {
        this.f24368a = kfzVar;
    }

    /* JADX INFO: renamed from: b */
    public static b7p0 m28392b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f24367c);
        if (integerArrayList == null) {
            return f24366b;
        }
        a7p0 a7p0Var = new a7p0();
        for (int i = 0; i < integerArrayList.size(); i++) {
            a7p0Var.m24987a(integerArrayList.get(i).intValue());
        }
        return a7p0Var.m24990d();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28393a(int i) {
        return this.f24368a.f122246a.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m28394c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            kfz kfzVar = this.f24368a;
            if (i >= kfzVar.f122246a.size()) {
                bundle.putIntegerArrayList(f24367c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(kfzVar.m56306b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b7p0) {
            return this.f24368a.equals(((b7p0) obj).f24368a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24368a.f122246a.hashCode();
    }
}
