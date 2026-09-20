package p204p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class ehw {

    /* JADX INFO: renamed from: a */
    public static final ehw f59682a = new ehw();

    /* JADX INFO: renamed from: b */
    public static final jfw f59683b = jfw.f111979a;

    /* JADX INFO: renamed from: c */
    public static final ydw f59684c = new ydw(qti0.m73843g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: d */
    public static final zgw f59685d = m39006b(chw.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: e */
    public static final zgw f59686e = m39006b(chw.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: f */
    public static final Set f59687f = Collections.singleton(new qfw());

    /* JADX INFO: renamed from: a */
    public static final ggw m39005a(int i, boolean z, String... strArr) {
        if (!z) {
            return new ggw(i, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new nh71(i, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* JADX INFO: renamed from: b */
    public static final zgw m39006b(chw chwVar, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return m39008d(chwVar, lau.f131415a, m39007c(chwVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* JADX INFO: renamed from: c */
    public static bhw m39007c(chw chwVar, String... strArr) {
        return new bhw(chwVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: d */
    public static zgw m39008d(chw chwVar, List list, jn91 jn91Var, String... strArr) {
        return new zgw(jn91Var, m39005a(7, false, (String[]) Arrays.copyOf(new String[]{jn91Var.toString()}, 1)), chwVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m39009e(oqo oqoVar) {
        if (oqoVar != null) {
            return (oqoVar instanceof ydw) || (oqoVar.mo27379o() instanceof ydw) || oqoVar == f59683b;
        }
        return false;
    }
}
