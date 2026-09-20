package p204p;

import android.content.DialogInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class tso implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JSONObject f223388b;

    public /* synthetic */ tso(JSONObject jSONObject, int i) {
        this.f223387a = i;
        this.f223388b = jSONObject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f223387a) {
            case 0:
                jfg1.m53184g(jfg1.m53183f("r", this.f223388b));
                break;
            default:
                jfg1.m53184g(jfg1.m53183f("g", this.f223388b));
                break;
        }
    }
}
