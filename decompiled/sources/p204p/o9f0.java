package p204p;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class o9f0 {

    /* JADX INFO: renamed from: d */
    public static final CopyOnWriteArraySet f163023d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public final String f163024a;

    /* JADX INFO: renamed from: b */
    public final String f163025b;

    /* JADX INFO: renamed from: c */
    public final List f163026c;

    public o9f0(String str, List list, String str2) {
        this.f163024a = str;
        this.f163025b = str2;
        this.f163026c = list;
    }

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet m66461a() {
        if (p2l.f173365a.contains(o9f0.class)) {
            return null;
        }
        try {
            return f163023d;
        } catch (Throwable th) {
            p2l.m68953a(o9f0.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m66462b() {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            return this.f163024a;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }
}
