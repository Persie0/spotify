package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class sa60 implements va60 {

    /* JADX INFO: renamed from: a */
    public final e8b f207149a;

    /* JADX INFO: renamed from: b */
    public final e8b f207150b;

    public sa60() {
        e8b e8bVar = new e8b(R.string.cal_errors_something_went_wrong);
        e8b e8bVar2 = new e8b(R.string.cal_jam_settings_body_error);
        this.f207149a = e8bVar;
        this.f207150b = e8bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa60)) {
            return false;
        }
        sa60 sa60Var = (sa60) obj;
        return this.f207149a.equals(sa60Var.f207149a) && this.f207150b.equals(sa60Var.f207150b);
    }

    public final int hashCode() {
        return this.f207150b.hashCode() + (this.f207149a.hashCode() * 31);
    }
}
