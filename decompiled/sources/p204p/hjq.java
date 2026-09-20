package p204p;

import android.graphics.ColorSpace;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class hjq implements uys0 {

    /* JADX INFO: renamed from: a */
    public final Map f92218a;

    public hjq(Map map) {
        this.f92218a = map;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.uys0
    /* JADX INFO: renamed from: a */
    public final Enum mo47705a(String str, Enum r7) {
        String str2;
        Enum[] enumArr;
        lb6 lb6Var = (lb6) this.f92218a.get(str);
        if (lb6Var != null && (str2 = lb6Var.f131573e) != null && (enumArr = (Enum[]) r7.getDeclaringClass().getEnumConstants()) != 0) {
            for (ColorSpace.Named named : enumArr) {
                if (wj50.m88271j(((uzv) named).value(), str2)) {
                    if (named == 0) {
                        return named;
                    }
                }
            }
            named = 0;
            if (named == 0) {
                return named;
            }
        }
        return r7;
    }

    @Override // p204p.uys0
    /* JADX INFO: renamed from: b */
    public final int mo47706b(int i, int i2, int i3, String str) {
        Integer num;
        int iIntValue;
        lb6 lb6Var = (lb6) this.f92218a.get(str);
        return ((lb6Var != null ? lb6Var.m58619a() : 0) == 2 && (num = lb6Var.f131572d) != null && i <= (iIntValue = num.intValue()) && iIntValue <= i2) ? iIntValue : i3;
    }

    @Override // p204p.uys0
    /* JADX INFO: renamed from: c */
    public final boolean mo47707c(String str, boolean z) {
        Boolean bool;
        lb6 lb6Var = (lb6) this.f92218a.get(str);
        return ((lb6Var != null ? lb6Var.m58619a() : 0) != 1 || (bool = lb6Var.f131571c) == null) ? z : bool.booleanValue();
    }
}
