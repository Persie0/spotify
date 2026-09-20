package p204p;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nzz {

    /* JADX INFO: renamed from: a */
    public String f160188a;

    /* JADX INFO: renamed from: b */
    public String f160189b;

    /* JADX INFO: renamed from: c */
    public List f160190c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzz)) {
            return false;
        }
        nzz nzzVar = (nzz) obj;
        return Objects.equals(this.f160188a, nzzVar.f160188a) && Objects.equals(this.f160189b, nzzVar.f160189b) && Objects.equals(this.f160190c, nzzVar.f160190c);
    }

    public final int hashCode() {
        return Objects.hash(this.f160188a, this.f160189b, this.f160190c);
    }
}
