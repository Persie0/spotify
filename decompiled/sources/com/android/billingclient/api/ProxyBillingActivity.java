package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.comscore.streaming.ContentType;
import com.google.android.apps.common.proguard.UsedByReflection;
import p204p.C2477v;
import p204p.crf1;
import p204p.edb;
import p204p.hgg1;
import p204p.mmf1;
import p204p.ye9;

/* JADX INFO: loaded from: classes3.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ResultReceiver f1480a;

    /* JADX INFO: renamed from: b */
    public boolean f1481b;

    /* JADX INFO: renamed from: c */
    public boolean f1482c;

    /* JADX INFO: renamed from: d */
    public int f1483d;

    /* JADX INFO: renamed from: e */
    public long f1484e;

    /* JADX INFO: renamed from: f */
    public boolean f1485f;

    /* JADX INFO: renamed from: a */
    public static int m1187a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return ContentType.LIVE;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    /* JADX INFO: renamed from: b */
    public final Intent m1188b(int i, long j) {
        Intent intentM1189c = m1189c();
        intentM1189c.putExtra("RESPONSE_CODE", 6);
        intentM1189c.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        C2477v c2477vM93531a = ye9.m93531a();
        c2477vM93531a.f235859a = 6;
        c2477vM93531a.f235861c = "An internal error occurred.";
        ye9 ye9VarM84353a = c2477vM93531a.m84353a();
        int i2 = crf1.f41290a;
        intentM1189c.putExtra("FAILURE_LOGGING_PAYLOAD", crf1.m33738b(i, 2, ye9VarM84353a, null, hgg1.BROADCAST_ACTION_UNSPECIFIED).m79593b());
        intentM1189c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentM1189c.putExtra("billingClientTransactionId", j);
        intentM1189c.putExtra("wasServiceAutoReconnected", this.f1485f);
        return intentM1189c;
    }

    /* JADX INFO: renamed from: c */
    public final Intent m1189c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a A[PHI: r10
      0x005a: PHI (r10v1 int) = (r10v0 int), (r10v13 int) binds: [B:28:0x0055, B:30:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String string;
        Intent intentM1189c;
        Bundle extras;
        int i5;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = mmf1.m62311e("ProxyBillingActivity", intent).f271939a;
            i4 = -1;
            if (i2 != -1) {
                Log.isLoggable("ProxyBillingActivity", 5);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                Log.isLoggable("ProxyBillingActivity", 5);
                i4 = i2;
            }
            if (true == z) {
                Log.isLoggable("ProxyBillingActivity", 5);
            } else {
                Log.isLoggable("ProxyBillingActivity", 5);
            }
            if (edb.m38554c(m1187a(intent, i4), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentM1189c = intent2;
                } else {
                    intentM1189c = m1189c();
                    intentM1189c.putExtras(intent.getExtras());
                    intentM1189c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM1189c.putExtra("billingClientTransactionId", this.f1484e);
                intentM1189c.putExtra("wasServiceAutoReconnected", this.f1485f);
            } else {
                intentM1189c = m1188b(m1187a(intent, i4), this.f1484e);
            }
            if (i == 110) {
                intentM1189c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM1189c);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = mmf1.m62311e("ProxyBillingActivity", intent).f271939a;
            i4 = -1;
            if (i2 != -1) {
                Log.isLoggable("ProxyBillingActivity", 5);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                Log.isLoggable("ProxyBillingActivity", 5);
                i4 = i2;
            }
            if (true == z || intent.getExtras() == null) {
                Log.isLoggable("ProxyBillingActivity", 5);
            }
            if (edb.m38554c(m1187a(intent, i4), 1)) {
                intentM1189c = m1188b(m1187a(intent, i4), this.f1484e);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentM1189c = intent3;
                } else {
                    intentM1189c = m1189c();
                    intentM1189c.putExtras(intent.getExtras());
                    intentM1189c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM1189c.putExtra("billingClientTransactionId", this.f1484e);
                intentM1189c.putExtra("wasServiceAutoReconnected", this.f1485f);
            }
            if (i == 110) {
                intentM1189c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM1189c);
        } else if (i == 101) {
            int i6 = mmf1.f145137a;
            if (intent == null || (extras = intent.getExtras()) == null) {
                Log.isLoggable("ProxyBillingActivity", 5);
                i5 = 0;
            } else {
                i5 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            }
            ResultReceiver resultReceiver = this.f1480a;
            if (resultReceiver != null) {
                resultReceiver.send(i5, intent == null ? null : intent.getExtras());
            }
        } else {
            int i7 = mmf1.f145137a;
            Log.isLoggable("ProxyBillingActivity", 5);
        }
        this.f1481b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            mmf1.m62313g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f1481b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f1480a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f1482c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f1483d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f1484e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f1485f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        mmf1.m62313g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f1483d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f1482c = true;
                this.f1483d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f1480a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f1483d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f1484e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f1485f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f1481b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f1483d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            mmf1.m62315i("ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f1480a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentM1188b = m1188b(137, this.f1484e);
                if (this.f1482c) {
                    intentM1188b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM1188b);
            }
            this.f1481b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f1481b) {
            Intent intentM1189c = m1189c();
            intentM1189c.putExtra("RESPONSE_CODE", 1);
            intentM1189c.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f1482c) {
                intentM1189c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f1483d;
            if (i == 110 || i == 100) {
                intentM1189c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentM1189c.putExtra("billingClientTransactionId", this.f1484e);
            }
            sendBroadcast(intentM1189c);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f1480a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f1481b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f1482c);
        bundle.putInt("activity_code", this.f1483d);
        bundle.putLong("billingClientTransactionId", this.f1484e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f1485f);
    }
}
