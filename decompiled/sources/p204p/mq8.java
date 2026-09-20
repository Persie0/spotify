package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mq8 {

    /* JADX INFO: renamed from: a */
    public final Set f146204a;

    /* JADX INFO: renamed from: b */
    public final wg61 f146205b = new wg61(new lq8(this, 0));

    /* JADX INFO: renamed from: c */
    public final wg61 f146206c = new wg61(new lq8(this, 1));

    /* JADX INFO: renamed from: d */
    public final wg61 f146207d = new wg61(new lq8(this, 2));

    /* JADX INFO: renamed from: e */
    public final wg61 f146208e = new wg61(new lq8(this, 3));

    public mq8(Set set) {
        this.f146204a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq8) && wj50.m88271j(this.f146204a, ((mq8) obj).f146204a);
    }

    public final int hashCode() {
        Set set = this.f146204a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }
}
