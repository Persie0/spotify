package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class egw {

    /* JADX INFO: renamed from: a */
    public static final mj5 f59410a = new mj5(bns0.Companion.serializer(), 0);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX INFO: renamed from: a */
    public static final ArrayList m38883a(String str, fk60 fk60Var) {
        Object c6x0Var;
        xrs0 srs0Var;
        try {
            c6x0Var = (List) fk60Var.m41880a(str, f59410a);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = lau.f131415a;
        }
        Iterable<bns0> iterable = (Iterable) c6x0Var;
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        for (bns0 bns0Var : iterable) {
            String str2 = bns0Var.f28920b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = bns0Var.f28919a;
            if (str3 != null) {
                switch (str3) {
                    case "BACKEND_ERROR":
                        srs0Var = new prs0(str2);
                        break;
                    case "TERMS_AND_SERVICES_CHECKER_ERROR":
                        srs0Var = new wrs0(str2);
                        break;
                    case "PROMPT_VALIDATOR_ERROR":
                        srs0Var = new urs0(str2);
                        break;
                    case "RATE_LIMIT_EXCEEDED_ERROR":
                        srs0Var = new rrs0(str2, "");
                        break;
                    default:
                        srs0Var = new srs0(str2);
                        break;
                }
            } else {
                srs0Var = new srs0(str2);
            }
            arrayList.add(srs0Var);
        }
        return arrayList;
    }
}
