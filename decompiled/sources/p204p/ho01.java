package p204p;

import com.comscore.streaming.ContentType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ho01 {
    /* JADX INFO: renamed from: a */
    public final ho01 m48015a(LinkedHashMap linkedHashMap) {
        if (this instanceof td51) {
            return td51.m80490i((td51) this, linkedHashMap, null, ContentType.SHORT_FORM_ON_DEMAND);
        }
        if (this instanceof ud51) {
            return ud51.m82825i((ud51) this, null, linkedHashMap, null, ContentType.SHORT_FORM_ON_DEMAND);
        }
        if (this instanceof vd51) {
            return vd51.m85209i((vd51) this, null, linkedHashMap, null, ContentType.SHORT_FORM_ON_DEMAND);
        }
        if (this instanceof lc40) {
            lc40 lc40Var = (lc40) this;
            return new lc40(lc40Var.f131817a, lc40Var.f131818b, lc40Var.f131819c, lc40Var.f131820d, linkedHashMap, lc40Var.f131822f, lc40Var.f131823g);
        }
        if (this instanceof an80) {
            return an80.m26480f((an80) this, linkedHashMap);
        }
        if (!(this instanceof bve0)) {
            throw new NoWhenBranchMatchedException();
        }
        bve0 bve0Var = (bve0) this;
        return new bve0(bve0Var.f31343a, bve0Var.f31344b, bve0Var.f31345c, bve0Var.f31346d, bve0Var.f31347e, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo26481b();

    /* JADX INFO: renamed from: c */
    public abstract String mo26482c();

    /* JADX INFO: renamed from: d */
    public abstract Map mo26483d();

    /* JADX INFO: renamed from: e */
    public abstract k1b1 mo26484e();
}
