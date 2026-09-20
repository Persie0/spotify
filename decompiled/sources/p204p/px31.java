package p204p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class px31 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f182194a;

    /* JADX INFO: renamed from: b */
    public static final vfe f182195b;

    static {
        List listM46715L = h6f.m46715L(fn60.f71195a, fn60.f71202h, fn60.f71203i, fn60.f71197c, fn60.f71198d, fn60.f71200f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM46715L.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(uc5.m82743x((y400) it.next()));
        }
        f182194a = linkedHashSet;
        f182195b = uc5.m82743x(fn60.f71201g);
    }
}
