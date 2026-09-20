package p204p;

import com.spotify.voiceassistants.playermodels.ParsedQueryKt;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g9f1 extends ejf1 {

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ int f77788a1;

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ ydw0 f77789b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9f1(ydw0 ydw0Var, int i, boolean z) {
        super(ydw0Var, false);
        this.f77788a1 = i;
        this.f77789b1 = ydw0Var;
    }

    @Override // p204p.ejf1
    /* JADX INFO: renamed from: k0 */
    public final void mo39176k0() {
        switch (this.f77788a1) {
            case 0:
                this.f77789b1.f271866c.m36029d(m39177l0(), -1);
                break;
            case 1:
                this.f77789b1.f271866c.m36029d(m39177l0(), 1);
                break;
            case 2:
                dhf1 dhf1Var = this.f77789b1.f271866c;
                lhf1 lhf1VarM39177l0 = m39177l0();
                dhf1Var.getClass();
                JSONObject jSONObject = new JSONObject();
                long jM67692c = dhf1Var.m67692c();
                try {
                    jSONObject.put("requestId", jM67692c);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", dhf1Var.m36030e());
                    break;
                } catch (JSONException unused) {
                }
                dhf1Var.m67691b(jM67692c, jSONObject.toString());
                dhf1Var.f49098r.m78129a(jM67692c, lhf1VarM39177l0);
                break;
            case 3:
                dhf1 dhf1Var2 = this.f77789b1.f271866c;
                lhf1 lhf1VarM39177l1 = m39177l0();
                dhf1Var2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jM67692c2 = dhf1Var2.m67692c();
                try {
                    jSONObject2.put("requestId", jM67692c2);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", dhf1Var2.m36030e());
                    break;
                } catch (JSONException unused2) {
                }
                dhf1Var2.m67691b(jM67692c2, jSONObject2.toString());
                dhf1Var2.f49091k.m78129a(jM67692c2, lhf1VarM39177l1);
                break;
            case 4:
                dhf1 dhf1Var3 = this.f77789b1.f271866c;
                lhf1 lhf1VarM39177l2 = m39177l0();
                dhf1Var3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long jM67692c3 = dhf1Var3.m67692c();
                try {
                    jSONObject3.put("requestId", jM67692c3);
                    jSONObject3.put("type", ParsedQueryKt.INTENT_PLAY);
                    jSONObject3.put("mediaSessionId", dhf1Var3.m36030e());
                    break;
                } catch (JSONException unused3) {
                }
                dhf1Var3.m67691b(jM67692c3, jSONObject3.toString());
                dhf1Var3.f49092l.m78129a(jM67692c3, lhf1VarM39177l2);
                break;
            default:
                dhf1 dhf1Var4 = this.f77789b1.f271866c;
                lhf1 lhf1VarM39177l3 = m39177l0();
                dhf1Var4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long jM67692c4 = dhf1Var4.m67692c();
                try {
                    jSONObject4.put("requestId", jM67692c4);
                    jSONObject4.put("type", "GET_STATUS");
                    ptd0 ptd0Var = dhf1Var4.f49086f;
                    if (ptd0Var != null) {
                        jSONObject4.put("mediaSessionId", ptd0Var.f181120b);
                    }
                    break;
                } catch (JSONException unused4) {
                }
                dhf1Var4.m67691b(jM67692c4, jSONObject4.toString());
                dhf1Var4.f49096p.m78129a(jM67692c4, lhf1VarM39177l3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9f1(ydw0 ydw0Var, int i) {
        super(ydw0Var, true);
        this.f77788a1 = i;
        switch (i) {
            case 5:
                Objects.requireNonNull(ydw0Var);
                this.f77789b1 = ydw0Var;
                super(ydw0Var, false);
                break;
            default:
                Objects.requireNonNull(ydw0Var);
                this.f77789b1 = ydw0Var;
                break;
        }
    }
}
