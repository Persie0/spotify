package p204p;

import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class d0w0 extends f0w0 {

    /* JADX INFO: renamed from: a */
    public final String f44095a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f44096b;

    public d0w0(String str, ArrayList arrayList) {
        this.f44095a = str;
        this.f44096b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0w0)) {
            return false;
        }
        d0w0 d0w0Var = (d0w0) obj;
        return wj50.m88271j(this.f44095a, d0w0Var.f44095a) && this.f44096b.equals(d0w0Var.f44096b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.green) + lq51.m59700f(this.f44096b, this.f44095a.hashCode() * 31, 29791);
    }
}
