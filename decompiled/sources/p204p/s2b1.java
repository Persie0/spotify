package p204p;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class s2b1 {

    /* JADX INFO: renamed from: a */
    public final Collection f204960a;

    /* JADX INFO: renamed from: b */
    public final Collection f204961b;

    /* JADX INFO: renamed from: c */
    public final Collection f204962c;

    /* JADX INFO: renamed from: d */
    public final Map f204963d;

    public s2b1(ConcurrentLinkedQueue concurrentLinkedQueue, ConcurrentLinkedQueue concurrentLinkedQueue2, ConcurrentLinkedQueue concurrentLinkedQueue3, ConcurrentHashMap concurrentHashMap) {
        this.f204960a = concurrentLinkedQueue;
        this.f204961b = concurrentLinkedQueue2;
        this.f204962c = concurrentLinkedQueue3;
        this.f204963d = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2b1)) {
            return false;
        }
        s2b1 s2b1Var = (s2b1) obj;
        return wj50.m88271j(this.f204960a, s2b1Var.f204960a) && wj50.m88271j(this.f204961b, s2b1Var.f204961b) && wj50.m88271j(this.f204962c, s2b1Var.f204962c) && wj50.m88271j(this.f204963d, s2b1Var.f204963d);
    }

    public final int hashCode() {
        return this.f204963d.hashCode() + ((this.f204962c.hashCode() + ((this.f204961b.hashCode() + (this.f204960a.hashCode() * 31)) * 31)) * 31);
    }
}
