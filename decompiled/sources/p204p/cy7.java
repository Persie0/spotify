package p204p;

import com.comscore.UsagePropertiesAutoUpdateMode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cy7 implements gh00 {
    /* JADX INFO: renamed from: a */
    public static Integer m34342a(faf fafVar) {
        int i;
        int iOrdinal = fafVar.ordinal();
        if (iOrdinal == 0) {
            i = UsagePropertiesAutoUpdateMode.DISABLED;
        } else if (iOrdinal == 1) {
            i = UsagePropertiesAutoUpdateMode.FOREGROUND_AND_BACKGROUND;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = UsagePropertiesAutoUpdateMode.FOREGROUND_ONLY;
        }
        return Integer.valueOf(i);
    }
}
