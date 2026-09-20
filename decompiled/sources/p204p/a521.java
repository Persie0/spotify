package p204p;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final class a521 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b521 f12380b;

    public /* synthetic */ a521(b521 b521Var, int i) {
        this.f12379a = i;
        this.f12380b = b521Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f12379a) {
            case 0:
                this.f12380b.f23496b.f23318c.m50411c(g0r.f75428a);
                break;
            case 1:
                this.f12380b.f23498d.m50410b(true);
                break;
            case 2:
                cir cirVar = this.f12380b.f23495a;
                zv41 zv41Var = cirVar.f38426g;
                Context context = cirVar.f38420a;
                sxa0 sxa0Var = new sxa0(null, context.getString(R.string.signup_error_generic_title), null, new rxa0(context.getString(R.string.signup_action_ok), ajq.f16311Q0), null, null, null, null, 245);
                zv41Var.getClass();
                zv41Var.m97091m(null, sxa0Var);
                break;
            case 3:
                cir cirVar2 = this.f12380b.f23495a;
                zv41 zv41Var2 = cirVar2.f38426g;
                Context context2 = cirVar2.f38420a;
                sxa0 sxa0Var2 = new sxa0(null, context2.getString(R.string.signup_age_error_invalid_age), null, new rxa0(context2.getString(R.string.signup_action_ok), ajq.f16312R0), null, null, null, null, 245);
                zv41Var2.getClass();
                zv41Var2.m97091m(null, sxa0Var2);
                break;
            case 4:
                cir cirVar3 = this.f12380b.f23495a;
                zv41 zv41Var3 = cirVar3.f38426g;
                Context context3 = cirVar3.f38420a;
                sxa0 sxa0Var3 = new sxa0(context3.getString(R.string.signup_email_error_email_already_taken_title), context3.getString(R.string.signup_email_error_email_already_taken_message), null, new rxa0(context3.getString(R.string.signup_action_go_to_login), ajq.f16309O0), new rxa0(context3.getString(R.string.signup_action_close), ajq.f16310P0), null, null, null, 228);
                zv41Var3.getClass();
                zv41Var3.m97091m(null, sxa0Var3);
                break;
            default:
                cir cirVar4 = this.f12380b.f23495a;
                zv41 zv41Var4 = cirVar4.f38426g;
                Context context4 = cirVar4.f38420a;
                sxa0 sxa0Var4 = new sxa0(context4.getString(R.string.signup_email_no_connection_dialog_title), context4.getString(R.string.signup_email_no_connection_dialog_message), null, new rxa0(context4.getString(R.string.signup_action_ok), ajq.f16313S0), null, null, null, null, 244);
                zv41Var4.getClass();
                zv41Var4.m97091m(null, sxa0Var4);
                break;
        }
    }
}
