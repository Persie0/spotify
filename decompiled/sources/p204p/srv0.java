package p204p;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class srv0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f213420a;

    /* JADX INFO: renamed from: b */
    public final int f213421b;

    public srv0(String str, int i) {
        this.f213420a = str;
        this.f213421b = i;
    }

    private final Object readResolve() {
        return new urv0(Pattern.compile(this.f213420a, this.f213421b));
    }
}
