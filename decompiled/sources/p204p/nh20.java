package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public interface nh20 {
    /* JADX INFO: renamed from: a */
    Integer mo58943a();

    /* JADX INFO: renamed from: b */
    default nh20 m64417b() {
        if (this instanceof nh20) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }
}
