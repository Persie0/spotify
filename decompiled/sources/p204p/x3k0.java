package p204p;

import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: classes11.dex */
public final class x3k0 extends hrg1 {

    /* JADX INFO: renamed from: c */
    public final FetchMode f257827c;

    /* JADX INFO: renamed from: d */
    public final i8a0 f257828d;

    public x3k0(FetchMode fetchMode, i8a0 i8a0Var) {
        this.f257827c = fetchMode;
        this.f257828d = i8a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3k0)) {
            return false;
        }
        x3k0 x3k0Var = (x3k0) obj;
        return this.f257827c == x3k0Var.f257827c && this.f257828d.equals(x3k0Var.f257828d);
    }

    public final int hashCode() {
        return this.f257828d.hashCode() + (this.f257827c.hashCode() * 31);
    }
}
