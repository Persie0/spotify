package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;

/* JADX INFO: loaded from: classes.dex */
public final class nrl {

    /* JADX INFO: renamed from: a */
    public final Activity f157580a;

    public /* synthetic */ nrl(Activity activity) {
        this.f157580a = activity;
    }

    /* JADX INFO: renamed from: b */
    public static Object m65481b(Context context, pph pphVar, ibk ibkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(ibkVar));
        hqbVar.m48222q();
        CancellationSignal cancellationSignal = new CancellationSignal();
        hqbVar.mo42415l(new enh(cancellationSignal, 2));
        qq8 qq8Var = new qq8(hqbVar, 25);
        lrl lrlVar = new lrl();
        xrl xrlVarM87087d = w2y0.m87087d(new w2y0(context, false));
        if (xrlVarM87087d == null) {
            qq8Var.m73505m(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            ((asl) xrlVarM87087d).m27100c(context, pphVar, cancellationSignal, lrlVar, qq8Var);
        }
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: a */
    public Object m65482a(Context context, w5l w5lVar, ibk ibkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(ibkVar));
        hqbVar.m48222q();
        CancellationSignal cancellationSignal = new CancellationSignal();
        hqbVar.mo42415l(new enh(cancellationSignal, 1));
        jsa jsaVar = new jsa(hqbVar, 22);
        lrl lrlVar = new lrl();
        xrl xrlVarM87087d = w2y0.m87087d(new w2y0(this.f157580a, false));
        if (xrlVarM87087d == null) {
            jsaVar.m54220j(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            ((asl) xrlVarM87087d).m27099b(context, w5lVar, cancellationSignal, lrlVar, jsaVar);
        }
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: c */
    public Intent m65483c() {
        Intent intent = (Intent) pp91.m70538s(this.f157580a.getIntent(), "intent", Intent.class);
        if (intent != null) {
            return intent;
        }
        throw new IllegalStateException("Source Intent was missing");
    }
}
