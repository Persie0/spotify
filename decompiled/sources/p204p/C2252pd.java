package p204p;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.facebook.FacebookException;
import com.spotify.music.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: p.pd */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2252pd implements zw10 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f176302b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Serializable f176303c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f176304d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f176305e;

    public /* synthetic */ C2252pd(Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.f176301a = i;
        this.f176302b = obj;
        this.f176303c = serializable;
        this.f176304d = obj2;
        this.f176305e = obj3;
    }

    @Override // p204p.zw10
    /* JADX INFO: renamed from: a */
    public final void mo41049a(gx10 gx10Var) {
        JSONArray jSONArrayOptJSONArray;
        JSONException jSONException;
        switch (this.f176301a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f176302b;
                HashSet hashSet = (HashSet) this.f176303c;
                HashSet hashSet2 = (HashSet) this.f176304d;
                HashSet hashSet3 = (HashSet) this.f176305e;
                JSONObject jSONObject = gx10Var.f85148d;
                if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                    atomicBoolean.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("permission");
                            String strOptString2 = jSONObjectOptJSONObject.optString("status");
                            if (!n0b1.m63385y(strOptString) && !n0b1.m63385y(strOptString2)) {
                                String lowerCase = strOptString2.toLowerCase(Locale.US);
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != -1309235419) {
                                    if (iHashCode != 280295099) {
                                        if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                            hashSet2.add(strOptString);
                                        }
                                    } else if (lowerCase.equals("granted")) {
                                        hashSet.add(strOptString);
                                    }
                                } else if (lowerCase.equals("expired")) {
                                    hashSet3.add(strOptString);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                final r5r r5rVar = (r5r) this.f176302b;
                final String str = (String) this.f176303c;
                final Date date = (Date) this.f176304d;
                final Date date2 = (Date) this.f176305e;
                if (!r5rVar.f196098U1.get()) {
                    e8y e8yVar = gx10Var.f85147c;
                    if (e8yVar != null) {
                        FacebookException facebookException = e8yVar.f57312i;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        r5rVar.m74825u1(facebookException);
                    } else {
                        try {
                            JSONObject jSONObject2 = gx10Var.f85146b;
                            if (jSONObject2 == null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                } catch (JSONException e) {
                                    jSONException = e;
                                    r5rVar.m74825u1(new FacebookException(jSONException));
                                }
                            }
                            final String string = jSONObject2.getString("id");
                            final whp whpVarM37741p = e45.m37741p(jSONObject2);
                            String string2 = jSONObject2.getString("name");
                            p5r p5rVar = r5rVar.f196101X1;
                            if (p5rVar != null) {
                                sbr.m77748a(p5rVar.f174209b);
                            }
                            lty ltyVarM71023b = pty.m71023b(p8y.m69344b());
                            if (!wj50.m88271j(ltyVarM71023b != null ? Boolean.valueOf(ltyVarM71023b.f136907c.contains(yw21.f276837d)) : null, Boolean.TRUE) || r5rVar.f196103Z1) {
                                r5rVar.m74822r1(string, whpVarM37741p, str, date, date2);
                            } else {
                                r5rVar.f196103Z1 = true;
                                String string3 = r5rVar.m49721t0().getString(R.string.com_facebook_smart_login_confirmation_title);
                                String string4 = r5rVar.m49721t0().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                                String string5 = r5rVar.m49721t0().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                                String str2 = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                                AlertDialog.Builder builder = new AlertDialog.Builder(r5rVar.m49717p0());
                                builder.setMessage(string3).setCancelable(true).setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: p.n5r
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        r5rVar.m74822r1(string, whpVarM37741p, str, date, date2);
                                    }
                                }).setPositiveButton(string5, new xm8(r5rVar, 2));
                                builder.create().show();
                            }
                        } catch (JSONException e2) {
                            jSONException = e2;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
