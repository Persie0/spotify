package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dri {

    /* JADX INFO: renamed from: a */
    public static final Map f52333a = n1h1.m63506p();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m36732a(Context context, voc1 voc1Var) {
        String string = context.getString(R.string.dialog_content_not_supported_body);
        Map map = f52333a;
        pan0 pan0Var = (pan0) map.get("gaia.content_not_supported");
        if (pan0Var == null || !pan0Var.isShowing()) {
            qan0 qan0Var = new qan0(context, R.style.Theme_Glue_Dialog);
            qan0Var.f274915d = context.getResources().getText(R.string.dialog_content_not_supported_title);
            qan0Var.f274916e = string;
            nq9 nq9Var = new nq9(16);
            qan0Var.f274917f = context.getResources().getText(R.string.dialog_content_not_supported_button);
            qan0Var.f274918g = nq9Var;
            qan0Var.f274919h = new uqo0(1);
            qan0Var.f274920i = new cri();
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            cbm0 cbm0VarM90923z1 = xgg1.m90923z1();
            fnm0 fnm0VarM86091c = voc1Var.m86091c();
            qan0Var.f186905j = (dme) context;
            qan0Var.f186906k = cbm0VarM90923z1;
            qan0Var.f186907l = fnm0VarM86091c;
            ran0 ran0VarM72474i = qan0Var.m72474i();
            ran0VarM72474i.show();
            map.put("gaia.content_not_supported", ran0VarM72474i);
        }
    }
}
