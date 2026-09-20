package p204p;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m5r implements zw10 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r5r f140281b;

    public /* synthetic */ m5r(r5r r5rVar, int i) {
        this.f140280a = i;
        this.f140281b = r5rVar;
    }

    @Override // p204p.zw10
    /* JADX INFO: renamed from: a */
    public final void mo41049a(gx10 gx10Var) {
        switch (this.f140280a) {
            case 0:
                r5r r5rVar = this.f140281b;
                if (!r5rVar.f196102Y1) {
                    e8y e8yVar = gx10Var.f85147c;
                    if (e8yVar != null) {
                        FacebookException facebookException = e8yVar.f57312i;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        r5rVar.m74825u1(facebookException);
                    } else {
                        JSONObject jSONObject = gx10Var.f85146b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        p5r p5rVar = new p5r();
                        try {
                            String string = jSONObject.getString("user_code");
                            p5rVar.f174209b = string;
                            p5rVar.f174208a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                            p5rVar.f174210c = jSONObject.getString("code");
                            p5rVar.f174211d = jSONObject.getLong("interval");
                            r5rVar.m74829y1(p5rVar);
                        } catch (JSONException e) {
                            r5rVar.m74825u1(new FacebookException(e));
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                r5r r5rVar2 = this.f140281b;
                if (!r5rVar2.f196098U1.get()) {
                    e8y e8yVar2 = gx10Var.f85147c;
                    if (e8yVar2 != null) {
                        int i = e8yVar2.f57306c;
                        if (i == 1349174 || i == 1349172) {
                            r5rVar2.m74828x1();
                        } else if (i == 1349152) {
                            p5r p5rVar2 = r5rVar2.f196101X1;
                            if (p5rVar2 != null) {
                                sbr.m77748a(p5rVar2.f174209b);
                            }
                            awa0 awa0Var = r5rVar2.f196104a2;
                            if (awa0Var == null) {
                                r5rVar2.m74824t1();
                            } else {
                                r5rVar2.m74830z1(awa0Var);
                            }
                        } else if (i != 1349173) {
                            FacebookException facebookException2 = e8yVar2.f57312i;
                            if (facebookException2 == null) {
                                facebookException2 = new FacebookException();
                            }
                            r5rVar2.m74825u1(facebookException2);
                        } else {
                            r5rVar2.m74824t1();
                        }
                    } else {
                        try {
                            JSONObject jSONObject2 = gx10Var.f85146b;
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            r5rVar2.m74826v1(jSONObject2.getLong("expires_in"), Long.valueOf(jSONObject2.optLong("data_access_expiration_time")), jSONObject2.getString("access_token"));
                        } catch (JSONException e2) {
                            r5rVar2.m74825u1(new FacebookException(e2));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
