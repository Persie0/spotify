package p204p;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a210 extends AbstractC2155n8 implements Serializable {
    /* JADX INFO: renamed from: e */
    public static x110 m24479e(AbstractC2155n8 abstractC2155n8, AbstractC2155n8 abstractC2155n9, int i, wyd1 wyd1Var, Class cls) {
        return new x110(abstractC2155n8, Collections.EMPTY_LIST, abstractC2155n9, new v110(i, wyd1Var, true), cls);
    }

    /* JADX INFO: renamed from: f */
    public static x110 m24480f(AbstractC2155n8 abstractC2155n8, Object obj, AbstractC2155n8 abstractC2155n9, int i, wyd1 wyd1Var, Class cls) {
        return new x110(abstractC2155n8, obj, abstractC2155n9, new v110(i, wyd1Var, false), cls);
    }
}
