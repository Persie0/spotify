package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class te0 {

    /* JADX INFO: renamed from: a */
    public final gky0 f219539a;

    public te0(gky0 gky0Var) {
        this.f219539a = gky0Var;
    }

    /* JADX INFO: renamed from: a */
    public final we0 m80523a(gh00 gh00Var, gh00 gh00Var2, up60 up60Var, up60 up60Var2) {
        gky0 gky0Var = this.f219539a;
        gky0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(up60Var);
        sb.append(up60Var2);
        String string = sb.toString();
        LinkedHashMap linkedHashMap = gky0Var.f80963a;
        hky0 hky0Var = (hky0) linkedHashMap.get(string);
        if (hky0Var == null) {
            hky0Var = new hky0();
            linkedHashMap.put(string, hky0Var);
        }
        return new we0(gh00Var2, gh00Var, hky0Var);
    }
}
