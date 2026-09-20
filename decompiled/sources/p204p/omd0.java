package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class omd0 {

    /* JADX INFO: renamed from: c */
    public static final omd0 f167017c = new omd0(new Bundle(), null);

    /* JADX INFO: renamed from: a */
    public final Bundle f167018a;

    /* JADX INFO: renamed from: b */
    public List f167019b;

    public omd0(Bundle bundle, ArrayList arrayList) {
        this.f167018a = bundle;
        this.f167019b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m67344a() {
        if (this.f167019b == null) {
            ArrayList<String> stringArrayList = this.f167018a.getStringArrayList("controlCategories");
            this.f167019b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f167019b = Collections.EMPTY_LIST;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m67345b() {
        m67344a();
        return new ArrayList(this.f167019b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof omd0)) {
            return false;
        }
        omd0 omd0Var = (omd0) obj;
        m67344a();
        omd0Var.m67344a();
        return this.f167019b.equals(omd0Var.f167019b);
    }

    public final int hashCode() {
        m67344a();
        return this.f167019b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(m67345b().toArray()) + " }";
    }
}
