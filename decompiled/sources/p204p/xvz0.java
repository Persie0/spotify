package p204p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class xvz0 extends yia {

    /* JADX INFO: renamed from: a */
    public final uvz0 f266544a;

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f266545b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yvz0 f266546c;

    public xvz0(yvz0 yvz0Var, uvz0 uvz0Var, CountDownLatch countDownLatch) {
        this.f266546c = yvz0Var;
        this.f266544a = uvz0Var;
        this.f266545b = countDownLatch;
    }

    /* JADX INFO: renamed from: b */
    public final void m92273b(bwz0 bwz0Var) {
        boolean z;
        String string;
        String str;
        String string2 = "";
        uvz0 uvz0Var = this.f266544a;
        try {
            syg1.m79703v("onPostExecuteInner " + uvz0Var);
            if (wia.f251584x != null && (uvz0Var instanceof vvz0)) {
                JSONObject jSONObject = uvz0Var.f234527c;
                okq okqVar = okq.RandomizedBundleToken;
                String string3 = jSONObject.has("external_intent_uri") ? uvz0Var.f234527c.getString("external_intent_uri") : "";
                JSONObject jSONObjectM30733a = bwz0Var.m30733a();
                int i = bwz0Var.f31750a;
                if (i != 200) {
                    String str2 = bwz0Var.f31752c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    if (i == -113) {
                        str = " Check network connectivity or DNS settings.";
                    } else if (i == -114) {
                        str = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
                    } else if (i == -104) {
                        str = " Did you forget to call init? Make sure you init the session before making Branch calls.";
                    } else if (i == -101) {
                        str = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
                    } else if (i == -102) {
                        str = " Please add 'android.permission.INTERNET' in your applications manifest file.";
                    } else if (i == -105) {
                        str = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
                    } else if (i == -108) {
                        str = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
                    } else if (i == -109) {
                        str = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
                    } else if (i == -110) {
                        str = " Unable create share options. Couldn't find applications on device to share the link.";
                    } else if (i == -111) {
                        str = " Request to Branch server timed out. Please check your internet connectivity";
                    } else if (i == -117) {
                        str = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
                    } else if (i == -118) {
                        str = " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
                    } else if (i >= 500 || i == -112) {
                        str = " Unable to reach the Branch servers, please try again shortly.";
                    } else if (i == 409 || i == -115) {
                        str = " A resource with this identifier already exists.";
                    } else if (i >= 400 || i == -116) {
                        str = " The request was invalid";
                    } else if (i == -119) {
                        str = "Intra-app linking (i.e. session reinitialization) requires an intent flag, \"branch_force_new_session\".";
                    } else {
                        str = i == -120 ? " Task exceeded timeout." : " See exception message or logs for more details. ";
                    }
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = "";
                }
                b9v0 b9v0Var = wia.f251584x;
                uvz0Var.m84073e();
                b9v0Var.m28546i(string3, string, jSONObjectM30733a);
            }
        } catch (Exception e) {
            syg1.m79689h("Failed to invoke tracing request callback:" + e.getMessage());
        }
        CountDownLatch countDownLatch = this.f266545b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (bwz0Var == null) {
            uvz0Var.mo27350f(-122, "Null response.");
            return;
        }
        String str3 = bwz0Var.f31752c;
        int i2 = bwz0Var.f31750a;
        yvz0 yvz0Var = this.f266546c;
        if (i2 == 200) {
            syg1.m79703v("onRequestSuccess " + bwz0Var);
            JSONObject jSONObjectM30733a2 = bwz0Var.m30733a();
            if (jSONObjectM30733a2 == null) {
                uvz0Var.mo27350f(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, "Null response json.");
            }
            if (uvz0Var instanceof irt0) {
                wia.m88198i().f251591g.clear();
                wia.m88198i().f251590f.m94757c();
            }
            if (uvz0Var instanceof vvz0) {
                if (!wia.m88198i().f251595k.f94953a && jSONObjectM30733a2 != null) {
                    try {
                        okq okqVar2 = okq.RandomizedBundleToken;
                        if (jSONObjectM30733a2.has("session_id")) {
                            wia.m88198i().f251586b.m87794Y("bnc_session_id", jSONObjectM30733a2.getString("session_id"));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (jSONObjectM30733a2.has("randomized_bundle_token")) {
                            String string4 = jSONObjectM30733a2.getString("randomized_bundle_token");
                            if (!wia.m88198i().f251586b.m87774E().equals(string4)) {
                                wia.m88198i().f251591g.clear();
                                wia.m88198i().f251586b.m87794Y("bnc_randomized_bundle_token", string4);
                                z = true;
                            }
                        }
                        if (jSONObjectM30733a2.has("randomized_device_token")) {
                            wia.m88198i().f251586b.m87794Y("bnc_randomized_device_token", jSONObjectM30733a2.getString("randomized_device_token"));
                            z = true;
                        }
                        if (z) {
                            yvz0Var.m94770q();
                        }
                    } catch (JSONException e2) {
                        edb.m38546B(e2, new StringBuilder("Caught JSONException "));
                    }
                }
                wia.m88198i().f251598n = 1;
                wia.m88198i().m88203a();
                wia.m88198i().getClass();
                wia.m88198i().getClass();
            }
            if (jSONObjectM30733a2 != null) {
                uvz0Var.mo27352h(bwz0Var, wia.m88198i());
                yvz0Var.m94767n(uvz0Var);
            } else {
                uvz0Var.getClass();
                yvz0Var.m94767n(uvz0Var);
            }
        } else {
            syg1.m79703v("onRequestFailed " + str3);
            if ((uvz0Var instanceof vvz0) && "bnc_no_value".equals(wia.m88198i().f251586b.m87778I("bnc_session_params"))) {
                wia.m88198i().f251598n = 3;
            }
            yvz0Var.f276796b = 0;
            StringBuilder sb2 = new StringBuilder();
            try {
                JSONObject jSONObjectM30733a3 = bwz0Var.m30733a();
                if (jSONObjectM30733a3 != null && jSONObjectM30733a3.has("error") && jSONObjectM30733a3.getJSONObject("error").has("message") && (string2 = jSONObjectM30733a3.getJSONObject("error").getString("message")) != null && string2.trim().length() > 0) {
                    string2 = string2.concat(".");
                }
            } catch (Exception e3) {
                syg1.m79704w("Caught Exception ServerResponse getFailReason: " + e3.getMessage());
            }
            sb2.append(string2);
            sb2.append(i2);
            sb2.append(" ");
            sb2.append(str3);
            uvz0Var.mo27350f(i2, sb2.toString());
            if (400 <= i2) {
            }
            wia.m88198i().f251590f.m94767n(uvz0Var);
        }
        yvz0Var.f276796b = 0;
        new Handler(Looper.getMainLooper()).post(new cjs0(this, 14));
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        uvz0 uvz0Var = this.f266544a;
        uvz0Var.mo51470a();
        int i = uvz0Var.f234528d;
        if ((uvz0Var instanceof irt0) || (uvz0Var instanceof jrt0)) {
            return new bwz0(200, "");
        }
        if (wia.m88198i().f251595k.f94953a && !uvz0Var.mo54193i()) {
            return new bwz0(-117, "Tracking is disabled");
        }
        String strM87778I = wia.m88198i().f251586b.m87778I("bnc_branch_key");
        bwz0 bwz0VarM82819f = null;
        try {
            syg1.m79703v("BranchPostTask doInBackground beginning rest post for " + uvz0Var);
            bwz0VarM82819f = wia.m88198i().f251585a.m82819f(uvz0Var.m84072d((ConcurrentHashMap) this.f266546c.f276799e), uvz0Var.m84073e(), nap.m64012e(i), strM87778I);
            CountDownLatch countDownLatch = this.f266545b;
            if (countDownLatch == null) {
                return bwz0VarM82819f;
            }
            countDownLatch.countDown();
            return bwz0VarM82819f;
        } catch (Exception e) {
            syg1.m79703v("BranchPostTask doInBackground caught exception: " + e.getMessage());
            return bwz0VarM82819f;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        bwz0 bwz0Var = (bwz0) obj;
        super.onPostExecute(bwz0Var);
        m92273b(bwz0Var);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
        uvz0 uvz0Var = this.f266544a;
        uvz0Var.mo27351g();
        uvz0Var.mo51471b();
    }
}
