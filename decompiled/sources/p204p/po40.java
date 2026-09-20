package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class po40 {

    /* JADX INFO: renamed from: a */
    public final long f179588a;

    /* JADX INFO: renamed from: b */
    public final long f179589b;

    /* JADX INFO: renamed from: c */
    public final long f179590c;

    /* JADX INFO: renamed from: d */
    public final boolean f179591d;

    /* JADX INFO: renamed from: e */
    public final float f179592e;

    /* JADX INFO: renamed from: f */
    public final long f179593f;

    /* JADX INFO: renamed from: g */
    public final long f179594g;

    /* JADX INFO: renamed from: h */
    public final boolean f179595h;

    /* JADX INFO: renamed from: i */
    public boolean f179596i;

    public po40(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.f179588a = j;
        this.f179589b = j2;
        this.f179590c = j3;
        this.f179591d = z;
        this.f179592e = f;
        this.f179593f = j4;
        this.f179594g = j5;
        this.f179595h = z2;
    }

    /* JADX INFO: renamed from: a */
    public final void m70471a() {
        this.f179596i = true;
    }

    /* JADX INFO: renamed from: b */
    public final long m70472b() {
        return this.f179590c;
    }

    /* JADX INFO: renamed from: c */
    public final long m70473c() {
        return this.f179589b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m70474d() {
        return this.f179596i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) pzb0.m71728z(this.f179588a));
        sb.append(", uptimeMillis=");
        sb.append(this.f179589b);
        sb.append(", position=");
        sb.append((Object) Offset.m259i(this.f179590c));
        sb.append(", pressed=");
        sb.append(this.f179591d);
        sb.append(", pressure=");
        sb.append(this.f179592e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f179593f);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.m259i(this.f179594g));
        sb.append(", previousPressed=");
        sb.append(this.f179595h);
        sb.append(", isConsumed=");
        return s571.m77253l(sb, this.f179596i, ')');
    }
}
