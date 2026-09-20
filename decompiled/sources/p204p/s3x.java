package p204p;

import com.spotify.mobius.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class s3x {

    /* JADX INFO: renamed from: a */
    public final List f205357a;

    /* JADX INFO: renamed from: b */
    public final String f205358b;

    /* JADX INFO: renamed from: c */
    public final String f205359c;

    /* JADX INFO: renamed from: d */
    public final Consumer f205360d;

    public s3x(List list, String str, String str2, Consumer consumer) {
        this.f205357a = list;
        this.f205358b = str;
        this.f205359c = str2;
        this.f205360d = consumer;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m77148a() {
        return this.f205360d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3x)) {
            return false;
        }
        s3x s3xVar = (s3x) obj;
        return wj50.m88271j(this.f205357a, s3xVar.f205357a) && wj50.m88271j(this.f205358b, s3xVar.f205358b) && wj50.m88271j(this.f205359c, s3xVar.f205359c) && wj50.m88271j(this.f205360d, s3xVar.f205360d);
    }

    public final int hashCode() {
        int iHashCode = this.f205357a.hashCode() * 31;
        String str = this.f205358b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f205359c;
        return this.f205360d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
