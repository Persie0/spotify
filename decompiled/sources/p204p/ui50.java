package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ui50 implements zi50 {

    /* JADX INFO: renamed from: a */
    public final Integer f230599a;

    /* JADX INFO: renamed from: b */
    public final long f230600b;

    public ui50(Integer num, long j) {
        this.f230599a = num;
        this.f230600b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui50)) {
            return false;
        }
        ui50 ui50Var = (ui50) obj;
        return wj50.m88271j(this.f230599a, ui50Var.f230599a) && this.f230600b == ui50Var.f230600b;
    }

    @Override // p204p.zi50
    public final String getName() {
        return "audio_route_type_changed";
    }

    public final int hashCode() {
        Integer num = this.f230599a;
        return Long.hashCode(this.f230600b) + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
