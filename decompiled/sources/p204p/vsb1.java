package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vsb1 {
    /* JADX INFO: renamed from: a */
    public abstract long mo81408a();

    /* JADX INFO: renamed from: b */
    public abstract long mo81409b();

    /* JADX INFO: renamed from: c */
    public final boolean m86306c() {
        if (this instanceof tsb1) {
            return ((tsb1) this).m81410d().length() > 0;
        }
        if (this instanceof usb1) {
            return ((usb1) this).f233581a.length() > 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
