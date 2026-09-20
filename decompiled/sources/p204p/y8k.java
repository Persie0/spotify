package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y8k {

    /* JADX INFO: renamed from: a */
    public final HashMap f270309a = new HashMap();

    public final int getType() {
        String string;
        Object obj = this.f270309a.get("requestedContextType");
        if (obj == null || (string = obj.toString()) == null) {
            return -1;
        }
        return Integer.parseInt(string);
    }

    public final void setType$continuity_release(int i) {
        this.f270309a.put("requestedContextType", Integer.valueOf(i));
    }
}
