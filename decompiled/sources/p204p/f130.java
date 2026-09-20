package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f130 implements x6z {

    /* JADX INFO: renamed from: a */
    public final String f64777a;

    /* JADX INFO: renamed from: b */
    public final List f64778b;

    /* JADX INFO: renamed from: c */
    public final boolean f64779c;

    public f130(String str, List list, boolean z) {
        this.f64777a = str;
        this.f64778b = Collections.unmodifiableList(list);
        this.f64779c = z;
    }
}
