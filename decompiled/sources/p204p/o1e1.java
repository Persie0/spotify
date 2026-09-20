package p204p;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class o1e1 {

    /* JADX INFO: renamed from: a */
    public final WorkDatabase_Impl f160711a;

    /* JADX INFO: renamed from: b */
    public final dtq f160712b;

    /* JADX INFO: renamed from: c */
    public final mh61 f160713c;

    /* JADX INFO: renamed from: d */
    public final mh61 f160714d;

    /* JADX INFO: renamed from: e */
    public final mh61 f160715e;

    /* JADX INFO: renamed from: f */
    public final mh61 f160716f;

    /* JADX INFO: renamed from: g */
    public final mh61 f160717g;

    /* JADX INFO: renamed from: h */
    public final mh61 f160718h;

    /* JADX INFO: renamed from: i */
    public final mh61 f160719i;

    /* JADX INFO: renamed from: j */
    public final mh61 f160720j;

    /* JADX INFO: renamed from: k */
    public final mh61 f160721k;

    /* JADX INFO: renamed from: l */
    public final mh61 f160722l;

    /* JADX INFO: renamed from: m */
    public final mh61 f160723m;

    /* JADX INFO: renamed from: n */
    public final mh61 f160724n;

    /* JADX INFO: renamed from: o */
    public final mh61 f160725o;

    public o1e1(WorkDatabase_Impl workDatabase_Impl) {
        this.f160711a = workDatabase_Impl;
        this.f160712b = new dtq(workDatabase_Impl, 5);
        this.f160713c = new mh61(workDatabase_Impl, 12);
        this.f160714d = new mh61(workDatabase_Impl, 13);
        this.f160715e = new mh61(workDatabase_Impl, 14);
        this.f160716f = new mh61(workDatabase_Impl, 15);
        this.f160717g = new mh61(workDatabase_Impl, 16);
        this.f160718h = new mh61(workDatabase_Impl, 17);
        this.f160719i = new mh61(workDatabase_Impl, 18);
        this.f160720j = new mh61(workDatabase_Impl, 19);
        this.f160721k = new mh61(workDatabase_Impl, 4);
        new mh61(workDatabase_Impl, 5);
        this.f160722l = new mh61(workDatabase_Impl, 6);
        this.f160723m = new mh61(workDatabase_Impl, 7);
        this.f160724n = new mh61(workDatabase_Impl, 8);
        new mh61(workDatabase_Impl, 9);
        new mh61(workDatabase_Impl, 10);
        this.f160725o = new mh61(workDatabase_Impl, 11);
    }

    /* JADX INFO: renamed from: a */
    public final void m66050a(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            x2h1.m89737A(map, new l1e1(this, 1));
            return;
        }
        StringBuilder sbM36620t = dq60.m36620t("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        n0e1.m63421b(size, sbM36620t);
        sbM36620t.append(")");
        String string = sbM36620t.toString();
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ojx0VarM50495m.mo38269L0(i, (String) it.next());
            i++;
        }
        Cursor cursorM65531q = nsf1.m65531q(this.f160711a, ojx0VarM50495m, false);
        try {
            int iM43274p = g0b1.m43274p(cursorM65531q, "work_spec_id");
            if (iM43274p == -1) {
                cursorM65531q.close();
                return;
            }
            while (cursorM65531q.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM65531q.getString(iM43274p));
                if (arrayList != null) {
                    arrayList.add(sco.m77812a(cursorM65531q.getBlob(0)));
                }
            }
            cursorM65531q.close();
        } catch (Throwable th) {
            cursorM65531q.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66051b(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            x2h1.m89737A(map, new l1e1(this, 0));
            return;
        }
        StringBuilder sbM36620t = dq60.m36620t("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        n0e1.m63421b(size, sbM36620t);
        sbM36620t.append(")");
        String string = sbM36620t.toString();
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ojx0VarM50495m.mo38269L0(i, (String) it.next());
            i++;
        }
        Cursor cursorM65531q = nsf1.m65531q(this.f160711a, ojx0VarM50495m, false);
        try {
            int iM43274p = g0b1.m43274p(cursorM65531q, "work_spec_id");
            if (iM43274p == -1) {
                cursorM65531q.close();
                return;
            }
            while (cursorM65531q.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM65531q.getString(iM43274p));
                if (arrayList != null) {
                    arrayList.add(cursorM65531q.getString(0));
                }
            }
            cursorM65531q.close();
        } catch (Throwable th) {
            cursorM65531q.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m66052c(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = this.f160714d;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        fa00VarM93329a.mo38269L0(1, str);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
            } catch (Throwable th) {
                workDatabase_Impl.m59184i();
                throw th;
            }
        } catch (Throwable th2) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m66053d() throws Throwable {
        ojx0 ojx0Var;
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        ojx0VarM50495m.mo38272u(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            int iM43275q = g0b1.m43275q(cursorM65531q, "id");
            int iM43275q2 = g0b1.m43275q(cursorM65531q, "state");
            int iM43275q3 = g0b1.m43275q(cursorM65531q, "worker_class_name");
            int iM43275q4 = g0b1.m43275q(cursorM65531q, "input_merger_class_name");
            int iM43275q5 = g0b1.m43275q(cursorM65531q, "input");
            int iM43275q6 = g0b1.m43275q(cursorM65531q, "output");
            int iM43275q7 = g0b1.m43275q(cursorM65531q, "initial_delay");
            int iM43275q8 = g0b1.m43275q(cursorM65531q, "interval_duration");
            int iM43275q9 = g0b1.m43275q(cursorM65531q, "flex_duration");
            int iM43275q10 = g0b1.m43275q(cursorM65531q, "run_attempt_count");
            int iM43275q11 = g0b1.m43275q(cursorM65531q, "backoff_policy");
            int iM43275q12 = g0b1.m43275q(cursorM65531q, "backoff_delay_duration");
            int iM43275q13 = g0b1.m43275q(cursorM65531q, "last_enqueue_time");
            ojx0Var = ojx0VarM50495m;
            try {
                int iM43275q14 = g0b1.m43275q(cursorM65531q, "minimum_retention_duration");
                int iM43275q15 = g0b1.m43275q(cursorM65531q, "schedule_requested_at");
                int iM43275q16 = g0b1.m43275q(cursorM65531q, "run_in_foreground");
                int iM43275q17 = g0b1.m43275q(cursorM65531q, "out_of_quota_policy");
                int iM43275q18 = g0b1.m43275q(cursorM65531q, "period_count");
                int iM43275q19 = g0b1.m43275q(cursorM65531q, "generation");
                int iM43275q20 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override");
                int iM43275q21 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override_generation");
                int iM43275q22 = g0b1.m43275q(cursorM65531q, "stop_reason");
                int iM43275q23 = g0b1.m43275q(cursorM65531q, "trace_tag");
                int iM43275q24 = g0b1.m43275q(cursorM65531q, "required_network_type");
                int iM43275q25 = g0b1.m43275q(cursorM65531q, "required_network_request");
                int iM43275q26 = g0b1.m43275q(cursorM65531q, "requires_charging");
                int iM43275q27 = g0b1.m43275q(cursorM65531q, "requires_device_idle");
                int iM43275q28 = g0b1.m43275q(cursorM65531q, "requires_battery_not_low");
                int iM43275q29 = g0b1.m43275q(cursorM65531q, "requires_storage_not_low");
                int iM43275q30 = g0b1.m43275q(cursorM65531q, "trigger_content_update_delay");
                int iM43275q31 = g0b1.m43275q(cursorM65531q, "trigger_max_content_delay");
                int iM43275q32 = g0b1.m43275q(cursorM65531q, "content_uri_triggers");
                int i = iM43275q14;
                ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
                while (cursorM65531q.moveToNext()) {
                    String string = cursorM65531q.getString(iM43275q);
                    h0e1 h0e1VarM63398F = n0e1.m63398F(cursorM65531q.getInt(iM43275q2));
                    String string2 = cursorM65531q.getString(iM43275q3);
                    String string3 = cursorM65531q.getString(iM43275q4);
                    sco scoVarM77812a = sco.m77812a(cursorM65531q.getBlob(iM43275q5));
                    sco scoVarM77812a2 = sco.m77812a(cursorM65531q.getBlob(iM43275q6));
                    long j = cursorM65531q.getLong(iM43275q7);
                    long j2 = cursorM65531q.getLong(iM43275q8);
                    long j3 = cursorM65531q.getLong(iM43275q9);
                    int i2 = cursorM65531q.getInt(iM43275q10);
                    to8 to8VarM63395C = n0e1.m63395C(cursorM65531q.getInt(iM43275q11));
                    long j4 = cursorM65531q.getLong(iM43275q12);
                    long j5 = cursorM65531q.getLong(iM43275q13);
                    int i3 = i;
                    long j6 = cursorM65531q.getLong(i3);
                    int i4 = iM43275q12;
                    int i5 = iM43275q15;
                    long j7 = cursorM65531q.getLong(i5);
                    iM43275q15 = i5;
                    int i6 = iM43275q16;
                    boolean z = cursorM65531q.getInt(i6) != 0;
                    iM43275q16 = i6;
                    int i7 = iM43275q17;
                    int iM63397E = n0e1.m63397E(cursorM65531q.getInt(i7));
                    iM43275q17 = i7;
                    int i8 = iM43275q18;
                    int i9 = cursorM65531q.getInt(i8);
                    iM43275q18 = i8;
                    int i10 = iM43275q19;
                    int i11 = cursorM65531q.getInt(i10);
                    iM43275q19 = i10;
                    int i12 = iM43275q20;
                    long j8 = cursorM65531q.getLong(i12);
                    iM43275q20 = i12;
                    int i13 = iM43275q21;
                    int i14 = cursorM65531q.getInt(i13);
                    iM43275q21 = i13;
                    int i15 = iM43275q22;
                    int i16 = cursorM65531q.getInt(i15);
                    iM43275q22 = i15;
                    int i17 = iM43275q23;
                    String string4 = cursorM65531q.isNull(i17) ? null : cursorM65531q.getString(i17);
                    iM43275q23 = i17;
                    int i18 = iM43275q24;
                    int iM63396D = n0e1.m63396D(cursorM65531q.getInt(i18));
                    iM43275q24 = i18;
                    int i19 = iM43275q25;
                    thj0 thj0VarM63416X = n0e1.m63416X(cursorM65531q.getBlob(i19));
                    iM43275q25 = i19;
                    int i20 = iM43275q26;
                    boolean z2 = cursorM65531q.getInt(i20) != 0;
                    iM43275q26 = i20;
                    int i21 = iM43275q27;
                    boolean z3 = cursorM65531q.getInt(i21) != 0;
                    iM43275q27 = i21;
                    int i22 = iM43275q28;
                    boolean z4 = cursorM65531q.getInt(i22) != 0;
                    iM43275q28 = i22;
                    int i23 = iM43275q29;
                    boolean z5 = cursorM65531q.getInt(i23) != 0;
                    iM43275q29 = i23;
                    int i24 = iM43275q30;
                    long j9 = cursorM65531q.getLong(i24);
                    iM43275q30 = i24;
                    int i25 = iM43275q31;
                    long j10 = cursorM65531q.getLong(i25);
                    iM43275q31 = i25;
                    int i26 = iM43275q32;
                    iM43275q32 = i26;
                    arrayList.add(new i1e1(string, h0e1VarM63398F, string2, string3, scoVarM77812a, scoVarM77812a2, j, j2, j3, new a8j(thj0VarM63416X, iM63396D, z2, z3, z4, z5, j9, j10, n0e1.m63427e(cursorM65531q.getBlob(i26))), i2, to8VarM63395C, j4, j5, j6, j7, z, iM63397E, i9, i11, j8, i14, i16, string4));
                    iM43275q12 = i4;
                    i = i3;
                }
                cursorM65531q.close();
                ojx0Var.m67120a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM65531q.close();
                ojx0Var.m67120a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ojx0Var = ojx0VarM50495m;
        }
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m66054e(int i) throws Throwable {
        ojx0 ojx0Var;
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        ojx0VarM50495m.mo38272u(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            int iM43275q = g0b1.m43275q(cursorM65531q, "id");
            int iM43275q2 = g0b1.m43275q(cursorM65531q, "state");
            int iM43275q3 = g0b1.m43275q(cursorM65531q, "worker_class_name");
            int iM43275q4 = g0b1.m43275q(cursorM65531q, "input_merger_class_name");
            int iM43275q5 = g0b1.m43275q(cursorM65531q, "input");
            int iM43275q6 = g0b1.m43275q(cursorM65531q, "output");
            int iM43275q7 = g0b1.m43275q(cursorM65531q, "initial_delay");
            int iM43275q8 = g0b1.m43275q(cursorM65531q, "interval_duration");
            int iM43275q9 = g0b1.m43275q(cursorM65531q, "flex_duration");
            int iM43275q10 = g0b1.m43275q(cursorM65531q, "run_attempt_count");
            int iM43275q11 = g0b1.m43275q(cursorM65531q, "backoff_policy");
            int iM43275q12 = g0b1.m43275q(cursorM65531q, "backoff_delay_duration");
            int iM43275q13 = g0b1.m43275q(cursorM65531q, "last_enqueue_time");
            ojx0Var = ojx0VarM50495m;
            try {
                int iM43275q14 = g0b1.m43275q(cursorM65531q, "minimum_retention_duration");
                int iM43275q15 = g0b1.m43275q(cursorM65531q, "schedule_requested_at");
                int iM43275q16 = g0b1.m43275q(cursorM65531q, "run_in_foreground");
                int iM43275q17 = g0b1.m43275q(cursorM65531q, "out_of_quota_policy");
                int iM43275q18 = g0b1.m43275q(cursorM65531q, "period_count");
                int iM43275q19 = g0b1.m43275q(cursorM65531q, "generation");
                int iM43275q20 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override");
                int iM43275q21 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override_generation");
                int iM43275q22 = g0b1.m43275q(cursorM65531q, "stop_reason");
                int iM43275q23 = g0b1.m43275q(cursorM65531q, "trace_tag");
                int iM43275q24 = g0b1.m43275q(cursorM65531q, "required_network_type");
                int iM43275q25 = g0b1.m43275q(cursorM65531q, "required_network_request");
                int iM43275q26 = g0b1.m43275q(cursorM65531q, "requires_charging");
                int iM43275q27 = g0b1.m43275q(cursorM65531q, "requires_device_idle");
                int iM43275q28 = g0b1.m43275q(cursorM65531q, "requires_battery_not_low");
                int iM43275q29 = g0b1.m43275q(cursorM65531q, "requires_storage_not_low");
                int iM43275q30 = g0b1.m43275q(cursorM65531q, "trigger_content_update_delay");
                int iM43275q31 = g0b1.m43275q(cursorM65531q, "trigger_max_content_delay");
                int iM43275q32 = g0b1.m43275q(cursorM65531q, "content_uri_triggers");
                int i2 = iM43275q14;
                ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
                while (cursorM65531q.moveToNext()) {
                    String string = cursorM65531q.getString(iM43275q);
                    h0e1 h0e1VarM63398F = n0e1.m63398F(cursorM65531q.getInt(iM43275q2));
                    String string2 = cursorM65531q.getString(iM43275q3);
                    String string3 = cursorM65531q.getString(iM43275q4);
                    sco scoVarM77812a = sco.m77812a(cursorM65531q.getBlob(iM43275q5));
                    sco scoVarM77812a2 = sco.m77812a(cursorM65531q.getBlob(iM43275q6));
                    long j = cursorM65531q.getLong(iM43275q7);
                    long j2 = cursorM65531q.getLong(iM43275q8);
                    long j3 = cursorM65531q.getLong(iM43275q9);
                    int i3 = cursorM65531q.getInt(iM43275q10);
                    to8 to8VarM63395C = n0e1.m63395C(cursorM65531q.getInt(iM43275q11));
                    long j4 = cursorM65531q.getLong(iM43275q12);
                    long j5 = cursorM65531q.getLong(iM43275q13);
                    int i4 = i2;
                    long j6 = cursorM65531q.getLong(i4);
                    int i5 = iM43275q12;
                    int i6 = iM43275q15;
                    long j7 = cursorM65531q.getLong(i6);
                    iM43275q15 = i6;
                    int i7 = iM43275q16;
                    boolean z = cursorM65531q.getInt(i7) != 0;
                    iM43275q16 = i7;
                    int i8 = iM43275q17;
                    int iM63397E = n0e1.m63397E(cursorM65531q.getInt(i8));
                    iM43275q17 = i8;
                    int i9 = iM43275q18;
                    int i10 = cursorM65531q.getInt(i9);
                    iM43275q18 = i9;
                    int i11 = iM43275q19;
                    int i12 = cursorM65531q.getInt(i11);
                    iM43275q19 = i11;
                    int i13 = iM43275q20;
                    long j8 = cursorM65531q.getLong(i13);
                    iM43275q20 = i13;
                    int i14 = iM43275q21;
                    int i15 = cursorM65531q.getInt(i14);
                    iM43275q21 = i14;
                    int i16 = iM43275q22;
                    int i17 = cursorM65531q.getInt(i16);
                    iM43275q22 = i16;
                    int i18 = iM43275q23;
                    String string4 = cursorM65531q.isNull(i18) ? null : cursorM65531q.getString(i18);
                    iM43275q23 = i18;
                    int i19 = iM43275q24;
                    int iM63396D = n0e1.m63396D(cursorM65531q.getInt(i19));
                    iM43275q24 = i19;
                    int i20 = iM43275q25;
                    thj0 thj0VarM63416X = n0e1.m63416X(cursorM65531q.getBlob(i20));
                    iM43275q25 = i20;
                    int i21 = iM43275q26;
                    boolean z2 = cursorM65531q.getInt(i21) != 0;
                    iM43275q26 = i21;
                    int i22 = iM43275q27;
                    boolean z3 = cursorM65531q.getInt(i22) != 0;
                    iM43275q27 = i22;
                    int i23 = iM43275q28;
                    boolean z4 = cursorM65531q.getInt(i23) != 0;
                    iM43275q28 = i23;
                    int i24 = iM43275q29;
                    boolean z5 = cursorM65531q.getInt(i24) != 0;
                    iM43275q29 = i24;
                    int i25 = iM43275q30;
                    long j9 = cursorM65531q.getLong(i25);
                    iM43275q30 = i25;
                    int i26 = iM43275q31;
                    long j10 = cursorM65531q.getLong(i26);
                    iM43275q31 = i26;
                    int i27 = iM43275q32;
                    iM43275q32 = i27;
                    arrayList.add(new i1e1(string, h0e1VarM63398F, string2, string3, scoVarM77812a, scoVarM77812a2, j, j2, j3, new a8j(thj0VarM63416X, iM63396D, z2, z3, z4, z5, j9, j10, n0e1.m63427e(cursorM65531q.getBlob(i27))), i3, to8VarM63395C, j4, j5, j6, j7, z, iM63397E, i10, i12, j8, i15, i17, string4));
                    iM43275q12 = i5;
                    i2 = i4;
                }
                cursorM65531q.close();
                ojx0Var.m67120a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM65531q.close();
                ojx0Var.m67120a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ojx0Var = ojx0VarM50495m;
        }
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m66055f() throws Throwable {
        ojx0 ojx0Var;
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            int iM43275q = g0b1.m43275q(cursorM65531q, "id");
            int iM43275q2 = g0b1.m43275q(cursorM65531q, "state");
            int iM43275q3 = g0b1.m43275q(cursorM65531q, "worker_class_name");
            int iM43275q4 = g0b1.m43275q(cursorM65531q, "input_merger_class_name");
            int iM43275q5 = g0b1.m43275q(cursorM65531q, "input");
            int iM43275q6 = g0b1.m43275q(cursorM65531q, "output");
            int iM43275q7 = g0b1.m43275q(cursorM65531q, "initial_delay");
            int iM43275q8 = g0b1.m43275q(cursorM65531q, "interval_duration");
            int iM43275q9 = g0b1.m43275q(cursorM65531q, "flex_duration");
            int iM43275q10 = g0b1.m43275q(cursorM65531q, "run_attempt_count");
            int iM43275q11 = g0b1.m43275q(cursorM65531q, "backoff_policy");
            int iM43275q12 = g0b1.m43275q(cursorM65531q, "backoff_delay_duration");
            int iM43275q13 = g0b1.m43275q(cursorM65531q, "last_enqueue_time");
            ojx0Var = ojx0VarM50495m;
            try {
                int iM43275q14 = g0b1.m43275q(cursorM65531q, "minimum_retention_duration");
                int iM43275q15 = g0b1.m43275q(cursorM65531q, "schedule_requested_at");
                int iM43275q16 = g0b1.m43275q(cursorM65531q, "run_in_foreground");
                int iM43275q17 = g0b1.m43275q(cursorM65531q, "out_of_quota_policy");
                int iM43275q18 = g0b1.m43275q(cursorM65531q, "period_count");
                int iM43275q19 = g0b1.m43275q(cursorM65531q, "generation");
                int iM43275q20 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override");
                int iM43275q21 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override_generation");
                int iM43275q22 = g0b1.m43275q(cursorM65531q, "stop_reason");
                int iM43275q23 = g0b1.m43275q(cursorM65531q, "trace_tag");
                int iM43275q24 = g0b1.m43275q(cursorM65531q, "required_network_type");
                int iM43275q25 = g0b1.m43275q(cursorM65531q, "required_network_request");
                int iM43275q26 = g0b1.m43275q(cursorM65531q, "requires_charging");
                int iM43275q27 = g0b1.m43275q(cursorM65531q, "requires_device_idle");
                int iM43275q28 = g0b1.m43275q(cursorM65531q, "requires_battery_not_low");
                int iM43275q29 = g0b1.m43275q(cursorM65531q, "requires_storage_not_low");
                int iM43275q30 = g0b1.m43275q(cursorM65531q, "trigger_content_update_delay");
                int iM43275q31 = g0b1.m43275q(cursorM65531q, "trigger_max_content_delay");
                int iM43275q32 = g0b1.m43275q(cursorM65531q, "content_uri_triggers");
                int i = iM43275q14;
                ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
                while (cursorM65531q.moveToNext()) {
                    String string = cursorM65531q.getString(iM43275q);
                    h0e1 h0e1VarM63398F = n0e1.m63398F(cursorM65531q.getInt(iM43275q2));
                    String string2 = cursorM65531q.getString(iM43275q3);
                    String string3 = cursorM65531q.getString(iM43275q4);
                    sco scoVarM77812a = sco.m77812a(cursorM65531q.getBlob(iM43275q5));
                    sco scoVarM77812a2 = sco.m77812a(cursorM65531q.getBlob(iM43275q6));
                    long j = cursorM65531q.getLong(iM43275q7);
                    long j2 = cursorM65531q.getLong(iM43275q8);
                    long j3 = cursorM65531q.getLong(iM43275q9);
                    int i2 = cursorM65531q.getInt(iM43275q10);
                    to8 to8VarM63395C = n0e1.m63395C(cursorM65531q.getInt(iM43275q11));
                    long j4 = cursorM65531q.getLong(iM43275q12);
                    long j5 = cursorM65531q.getLong(iM43275q13);
                    int i3 = i;
                    long j6 = cursorM65531q.getLong(i3);
                    int i4 = iM43275q13;
                    int i5 = iM43275q15;
                    long j7 = cursorM65531q.getLong(i5);
                    iM43275q15 = i5;
                    int i6 = iM43275q16;
                    boolean z = cursorM65531q.getInt(i6) != 0;
                    iM43275q16 = i6;
                    int i7 = iM43275q17;
                    int iM63397E = n0e1.m63397E(cursorM65531q.getInt(i7));
                    iM43275q17 = i7;
                    int i8 = iM43275q18;
                    int i9 = cursorM65531q.getInt(i8);
                    iM43275q18 = i8;
                    int i10 = iM43275q19;
                    int i11 = cursorM65531q.getInt(i10);
                    iM43275q19 = i10;
                    int i12 = iM43275q20;
                    long j8 = cursorM65531q.getLong(i12);
                    iM43275q20 = i12;
                    int i13 = iM43275q21;
                    int i14 = cursorM65531q.getInt(i13);
                    iM43275q21 = i13;
                    int i15 = iM43275q22;
                    int i16 = cursorM65531q.getInt(i15);
                    iM43275q22 = i15;
                    int i17 = iM43275q23;
                    String string4 = cursorM65531q.isNull(i17) ? null : cursorM65531q.getString(i17);
                    iM43275q23 = i17;
                    int i18 = iM43275q24;
                    int iM63396D = n0e1.m63396D(cursorM65531q.getInt(i18));
                    iM43275q24 = i18;
                    int i19 = iM43275q25;
                    thj0 thj0VarM63416X = n0e1.m63416X(cursorM65531q.getBlob(i19));
                    iM43275q25 = i19;
                    int i20 = iM43275q26;
                    boolean z2 = cursorM65531q.getInt(i20) != 0;
                    iM43275q26 = i20;
                    int i21 = iM43275q27;
                    boolean z3 = cursorM65531q.getInt(i21) != 0;
                    iM43275q27 = i21;
                    int i22 = iM43275q28;
                    boolean z4 = cursorM65531q.getInt(i22) != 0;
                    iM43275q28 = i22;
                    int i23 = iM43275q29;
                    boolean z5 = cursorM65531q.getInt(i23) != 0;
                    iM43275q29 = i23;
                    int i24 = iM43275q30;
                    long j9 = cursorM65531q.getLong(i24);
                    iM43275q30 = i24;
                    int i25 = iM43275q31;
                    long j10 = cursorM65531q.getLong(i25);
                    iM43275q31 = i25;
                    int i26 = iM43275q32;
                    iM43275q32 = i26;
                    arrayList.add(new i1e1(string, h0e1VarM63398F, string2, string3, scoVarM77812a, scoVarM77812a2, j, j2, j3, new a8j(thj0VarM63416X, iM63396D, z2, z3, z4, z5, j9, j10, n0e1.m63427e(cursorM65531q.getBlob(i26))), i2, to8VarM63395C, j4, j5, j6, j7, z, iM63397E, i9, i11, j8, i14, i16, string4));
                    iM43275q13 = i4;
                    i = i3;
                }
                cursorM65531q.close();
                ojx0Var.m67120a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM65531q.close();
                ojx0Var.m67120a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ojx0Var = ojx0VarM50495m;
        }
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m66056g() throws Throwable {
        ojx0 ojx0Var;
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            int iM43275q = g0b1.m43275q(cursorM65531q, "id");
            int iM43275q2 = g0b1.m43275q(cursorM65531q, "state");
            int iM43275q3 = g0b1.m43275q(cursorM65531q, "worker_class_name");
            int iM43275q4 = g0b1.m43275q(cursorM65531q, "input_merger_class_name");
            int iM43275q5 = g0b1.m43275q(cursorM65531q, "input");
            int iM43275q6 = g0b1.m43275q(cursorM65531q, "output");
            int iM43275q7 = g0b1.m43275q(cursorM65531q, "initial_delay");
            int iM43275q8 = g0b1.m43275q(cursorM65531q, "interval_duration");
            int iM43275q9 = g0b1.m43275q(cursorM65531q, "flex_duration");
            int iM43275q10 = g0b1.m43275q(cursorM65531q, "run_attempt_count");
            int iM43275q11 = g0b1.m43275q(cursorM65531q, "backoff_policy");
            int iM43275q12 = g0b1.m43275q(cursorM65531q, "backoff_delay_duration");
            int iM43275q13 = g0b1.m43275q(cursorM65531q, "last_enqueue_time");
            ojx0Var = ojx0VarM50495m;
            try {
                int iM43275q14 = g0b1.m43275q(cursorM65531q, "minimum_retention_duration");
                int iM43275q15 = g0b1.m43275q(cursorM65531q, "schedule_requested_at");
                int iM43275q16 = g0b1.m43275q(cursorM65531q, "run_in_foreground");
                int iM43275q17 = g0b1.m43275q(cursorM65531q, "out_of_quota_policy");
                int iM43275q18 = g0b1.m43275q(cursorM65531q, "period_count");
                int iM43275q19 = g0b1.m43275q(cursorM65531q, "generation");
                int iM43275q20 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override");
                int iM43275q21 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override_generation");
                int iM43275q22 = g0b1.m43275q(cursorM65531q, "stop_reason");
                int iM43275q23 = g0b1.m43275q(cursorM65531q, "trace_tag");
                int iM43275q24 = g0b1.m43275q(cursorM65531q, "required_network_type");
                int iM43275q25 = g0b1.m43275q(cursorM65531q, "required_network_request");
                int iM43275q26 = g0b1.m43275q(cursorM65531q, "requires_charging");
                int iM43275q27 = g0b1.m43275q(cursorM65531q, "requires_device_idle");
                int iM43275q28 = g0b1.m43275q(cursorM65531q, "requires_battery_not_low");
                int iM43275q29 = g0b1.m43275q(cursorM65531q, "requires_storage_not_low");
                int iM43275q30 = g0b1.m43275q(cursorM65531q, "trigger_content_update_delay");
                int iM43275q31 = g0b1.m43275q(cursorM65531q, "trigger_max_content_delay");
                int iM43275q32 = g0b1.m43275q(cursorM65531q, "content_uri_triggers");
                int i = iM43275q14;
                ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
                while (cursorM65531q.moveToNext()) {
                    String string = cursorM65531q.getString(iM43275q);
                    h0e1 h0e1VarM63398F = n0e1.m63398F(cursorM65531q.getInt(iM43275q2));
                    String string2 = cursorM65531q.getString(iM43275q3);
                    String string3 = cursorM65531q.getString(iM43275q4);
                    sco scoVarM77812a = sco.m77812a(cursorM65531q.getBlob(iM43275q5));
                    sco scoVarM77812a2 = sco.m77812a(cursorM65531q.getBlob(iM43275q6));
                    long j = cursorM65531q.getLong(iM43275q7);
                    long j2 = cursorM65531q.getLong(iM43275q8);
                    long j3 = cursorM65531q.getLong(iM43275q9);
                    int i2 = cursorM65531q.getInt(iM43275q10);
                    to8 to8VarM63395C = n0e1.m63395C(cursorM65531q.getInt(iM43275q11));
                    long j4 = cursorM65531q.getLong(iM43275q12);
                    long j5 = cursorM65531q.getLong(iM43275q13);
                    int i3 = i;
                    long j6 = cursorM65531q.getLong(i3);
                    int i4 = iM43275q13;
                    int i5 = iM43275q15;
                    long j7 = cursorM65531q.getLong(i5);
                    iM43275q15 = i5;
                    int i6 = iM43275q16;
                    boolean z = cursorM65531q.getInt(i6) != 0;
                    iM43275q16 = i6;
                    int i7 = iM43275q17;
                    int iM63397E = n0e1.m63397E(cursorM65531q.getInt(i7));
                    iM43275q17 = i7;
                    int i8 = iM43275q18;
                    int i9 = cursorM65531q.getInt(i8);
                    iM43275q18 = i8;
                    int i10 = iM43275q19;
                    int i11 = cursorM65531q.getInt(i10);
                    iM43275q19 = i10;
                    int i12 = iM43275q20;
                    long j8 = cursorM65531q.getLong(i12);
                    iM43275q20 = i12;
                    int i13 = iM43275q21;
                    int i14 = cursorM65531q.getInt(i13);
                    iM43275q21 = i13;
                    int i15 = iM43275q22;
                    int i16 = cursorM65531q.getInt(i15);
                    iM43275q22 = i15;
                    int i17 = iM43275q23;
                    String string4 = cursorM65531q.isNull(i17) ? null : cursorM65531q.getString(i17);
                    iM43275q23 = i17;
                    int i18 = iM43275q24;
                    int iM63396D = n0e1.m63396D(cursorM65531q.getInt(i18));
                    iM43275q24 = i18;
                    int i19 = iM43275q25;
                    thj0 thj0VarM63416X = n0e1.m63416X(cursorM65531q.getBlob(i19));
                    iM43275q25 = i19;
                    int i20 = iM43275q26;
                    boolean z2 = cursorM65531q.getInt(i20) != 0;
                    iM43275q26 = i20;
                    int i21 = iM43275q27;
                    boolean z3 = cursorM65531q.getInt(i21) != 0;
                    iM43275q27 = i21;
                    int i22 = iM43275q28;
                    boolean z4 = cursorM65531q.getInt(i22) != 0;
                    iM43275q28 = i22;
                    int i23 = iM43275q29;
                    boolean z5 = cursorM65531q.getInt(i23) != 0;
                    iM43275q29 = i23;
                    int i24 = iM43275q30;
                    long j9 = cursorM65531q.getLong(i24);
                    iM43275q30 = i24;
                    int i25 = iM43275q31;
                    long j10 = cursorM65531q.getLong(i25);
                    iM43275q31 = i25;
                    int i26 = iM43275q32;
                    iM43275q32 = i26;
                    arrayList.add(new i1e1(string, h0e1VarM63398F, string2, string3, scoVarM77812a, scoVarM77812a2, j, j2, j3, new a8j(thj0VarM63416X, iM63396D, z2, z3, z4, z5, j9, j10, n0e1.m63427e(cursorM65531q.getBlob(i26))), i2, to8VarM63395C, j4, j5, j6, j7, z, iM63397E, i9, i11, j8, i14, i16, string4));
                    iM43275q13 = i4;
                    i = i3;
                }
                cursorM65531q.close();
                ojx0Var.m67120a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM65531q.close();
                ojx0Var.m67120a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ojx0Var = ojx0VarM50495m;
        }
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList m66057h() {
        ojx0 ojx0Var;
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            int iM43275q = g0b1.m43275q(cursorM65531q, "id");
            int iM43275q2 = g0b1.m43275q(cursorM65531q, "state");
            int iM43275q3 = g0b1.m43275q(cursorM65531q, "worker_class_name");
            int iM43275q4 = g0b1.m43275q(cursorM65531q, "input_merger_class_name");
            int iM43275q5 = g0b1.m43275q(cursorM65531q, "input");
            int iM43275q6 = g0b1.m43275q(cursorM65531q, "output");
            int iM43275q7 = g0b1.m43275q(cursorM65531q, "initial_delay");
            int iM43275q8 = g0b1.m43275q(cursorM65531q, "interval_duration");
            int iM43275q9 = g0b1.m43275q(cursorM65531q, "flex_duration");
            int iM43275q10 = g0b1.m43275q(cursorM65531q, "run_attempt_count");
            int iM43275q11 = g0b1.m43275q(cursorM65531q, "backoff_policy");
            int iM43275q12 = g0b1.m43275q(cursorM65531q, "backoff_delay_duration");
            int iM43275q13 = g0b1.m43275q(cursorM65531q, "last_enqueue_time");
            ojx0Var = ojx0VarM50495m;
            try {
                int iM43275q14 = g0b1.m43275q(cursorM65531q, "minimum_retention_duration");
                int iM43275q15 = g0b1.m43275q(cursorM65531q, "schedule_requested_at");
                int iM43275q16 = g0b1.m43275q(cursorM65531q, "run_in_foreground");
                int iM43275q17 = g0b1.m43275q(cursorM65531q, "out_of_quota_policy");
                int iM43275q18 = g0b1.m43275q(cursorM65531q, "period_count");
                int iM43275q19 = g0b1.m43275q(cursorM65531q, "generation");
                int iM43275q20 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override");
                int iM43275q21 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override_generation");
                int iM43275q22 = g0b1.m43275q(cursorM65531q, "stop_reason");
                int iM43275q23 = g0b1.m43275q(cursorM65531q, "trace_tag");
                int iM43275q24 = g0b1.m43275q(cursorM65531q, "required_network_type");
                int iM43275q25 = g0b1.m43275q(cursorM65531q, "required_network_request");
                int iM43275q26 = g0b1.m43275q(cursorM65531q, "requires_charging");
                int iM43275q27 = g0b1.m43275q(cursorM65531q, "requires_device_idle");
                int iM43275q28 = g0b1.m43275q(cursorM65531q, "requires_battery_not_low");
                int iM43275q29 = g0b1.m43275q(cursorM65531q, "requires_storage_not_low");
                int iM43275q30 = g0b1.m43275q(cursorM65531q, "trigger_content_update_delay");
                int iM43275q31 = g0b1.m43275q(cursorM65531q, "trigger_max_content_delay");
                int iM43275q32 = g0b1.m43275q(cursorM65531q, "content_uri_triggers");
                int i = iM43275q14;
                ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
                while (cursorM65531q.moveToNext()) {
                    String string = cursorM65531q.getString(iM43275q);
                    h0e1 h0e1VarM63398F = n0e1.m63398F(cursorM65531q.getInt(iM43275q2));
                    String string2 = cursorM65531q.getString(iM43275q3);
                    String string3 = cursorM65531q.getString(iM43275q4);
                    sco scoVarM77812a = sco.m77812a(cursorM65531q.getBlob(iM43275q5));
                    sco scoVarM77812a2 = sco.m77812a(cursorM65531q.getBlob(iM43275q6));
                    long j = cursorM65531q.getLong(iM43275q7);
                    long j2 = cursorM65531q.getLong(iM43275q8);
                    long j3 = cursorM65531q.getLong(iM43275q9);
                    int i2 = cursorM65531q.getInt(iM43275q10);
                    to8 to8VarM63395C = n0e1.m63395C(cursorM65531q.getInt(iM43275q11));
                    long j4 = cursorM65531q.getLong(iM43275q12);
                    long j5 = cursorM65531q.getLong(iM43275q13);
                    int i3 = i;
                    long j6 = cursorM65531q.getLong(i3);
                    int i4 = iM43275q13;
                    int i5 = iM43275q15;
                    long j7 = cursorM65531q.getLong(i5);
                    iM43275q15 = i5;
                    int i6 = iM43275q16;
                    boolean z = cursorM65531q.getInt(i6) != 0;
                    iM43275q16 = i6;
                    int i7 = iM43275q17;
                    int iM63397E = n0e1.m63397E(cursorM65531q.getInt(i7));
                    iM43275q17 = i7;
                    int i8 = iM43275q18;
                    int i9 = cursorM65531q.getInt(i8);
                    iM43275q18 = i8;
                    int i10 = iM43275q19;
                    int i11 = cursorM65531q.getInt(i10);
                    iM43275q19 = i10;
                    int i12 = iM43275q20;
                    long j8 = cursorM65531q.getLong(i12);
                    iM43275q20 = i12;
                    int i13 = iM43275q21;
                    int i14 = cursorM65531q.getInt(i13);
                    iM43275q21 = i13;
                    int i15 = iM43275q22;
                    int i16 = cursorM65531q.getInt(i15);
                    iM43275q22 = i15;
                    int i17 = iM43275q23;
                    String string4 = cursorM65531q.isNull(i17) ? null : cursorM65531q.getString(i17);
                    iM43275q23 = i17;
                    int i18 = iM43275q24;
                    int iM63396D = n0e1.m63396D(cursorM65531q.getInt(i18));
                    iM43275q24 = i18;
                    int i19 = iM43275q25;
                    thj0 thj0VarM63416X = n0e1.m63416X(cursorM65531q.getBlob(i19));
                    iM43275q25 = i19;
                    int i20 = iM43275q26;
                    boolean z2 = cursorM65531q.getInt(i20) != 0;
                    iM43275q26 = i20;
                    int i21 = iM43275q27;
                    boolean z3 = cursorM65531q.getInt(i21) != 0;
                    iM43275q27 = i21;
                    int i22 = iM43275q28;
                    boolean z4 = cursorM65531q.getInt(i22) != 0;
                    iM43275q28 = i22;
                    int i23 = iM43275q29;
                    boolean z5 = cursorM65531q.getInt(i23) != 0;
                    iM43275q29 = i23;
                    int i24 = iM43275q30;
                    long j9 = cursorM65531q.getLong(i24);
                    iM43275q30 = i24;
                    int i25 = iM43275q31;
                    long j10 = cursorM65531q.getLong(i25);
                    iM43275q31 = i25;
                    int i26 = iM43275q32;
                    iM43275q32 = i26;
                    arrayList.add(new i1e1(string, h0e1VarM63398F, string2, string3, scoVarM77812a, scoVarM77812a2, j, j2, j3, new a8j(thj0VarM63416X, iM63396D, z2, z3, z4, z5, j9, j10, n0e1.m63427e(cursorM65531q.getBlob(i26))), i2, to8VarM63395C, j4, j5, j6, j7, z, iM63397E, i9, i11, j8, i14, i16, string4));
                    iM43275q13 = i4;
                    i = i3;
                }
                cursorM65531q.close();
                ojx0Var.m67120a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM65531q.close();
                ojx0Var.m67120a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ojx0Var = ojx0VarM50495m;
        }
    }

    /* JADX INFO: renamed from: i */
    public final h0e1 m66058i(String str) {
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT state FROM workspec WHERE id=?");
        ojx0VarM50495m.mo38269L0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            h0e1 h0e1VarM63398F = null;
            if (cursorM65531q.moveToFirst()) {
                Integer numValueOf = cursorM65531q.isNull(0) ? null : Integer.valueOf(cursorM65531q.getInt(0));
                if (numValueOf != null) {
                    h0e1VarM63398F = n0e1.m63398F(numValueOf.intValue());
                }
            }
            return h0e1VarM63398F;
        } finally {
            cursorM65531q.close();
            ojx0VarM50495m.m67120a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final i1e1 m66059j(String str) {
        ojx0 ojx0Var;
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT * FROM workspec WHERE id=?");
        ojx0VarM50495m.mo38269L0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            int iM43275q = g0b1.m43275q(cursorM65531q, "id");
            int iM43275q2 = g0b1.m43275q(cursorM65531q, "state");
            int iM43275q3 = g0b1.m43275q(cursorM65531q, "worker_class_name");
            int iM43275q4 = g0b1.m43275q(cursorM65531q, "input_merger_class_name");
            int iM43275q5 = g0b1.m43275q(cursorM65531q, "input");
            int iM43275q6 = g0b1.m43275q(cursorM65531q, "output");
            int iM43275q7 = g0b1.m43275q(cursorM65531q, "initial_delay");
            int iM43275q8 = g0b1.m43275q(cursorM65531q, "interval_duration");
            int iM43275q9 = g0b1.m43275q(cursorM65531q, "flex_duration");
            int iM43275q10 = g0b1.m43275q(cursorM65531q, "run_attempt_count");
            int iM43275q11 = g0b1.m43275q(cursorM65531q, "backoff_policy");
            int iM43275q12 = g0b1.m43275q(cursorM65531q, "backoff_delay_duration");
            int iM43275q13 = g0b1.m43275q(cursorM65531q, "last_enqueue_time");
            ojx0Var = ojx0VarM50495m;
            try {
                int iM43275q14 = g0b1.m43275q(cursorM65531q, "minimum_retention_duration");
                int iM43275q15 = g0b1.m43275q(cursorM65531q, "schedule_requested_at");
                int iM43275q16 = g0b1.m43275q(cursorM65531q, "run_in_foreground");
                int iM43275q17 = g0b1.m43275q(cursorM65531q, "out_of_quota_policy");
                int iM43275q18 = g0b1.m43275q(cursorM65531q, "period_count");
                int iM43275q19 = g0b1.m43275q(cursorM65531q, "generation");
                int iM43275q20 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override");
                int iM43275q21 = g0b1.m43275q(cursorM65531q, "next_schedule_time_override_generation");
                int iM43275q22 = g0b1.m43275q(cursorM65531q, "stop_reason");
                int iM43275q23 = g0b1.m43275q(cursorM65531q, "trace_tag");
                int iM43275q24 = g0b1.m43275q(cursorM65531q, "required_network_type");
                int iM43275q25 = g0b1.m43275q(cursorM65531q, "required_network_request");
                int iM43275q26 = g0b1.m43275q(cursorM65531q, "requires_charging");
                int iM43275q27 = g0b1.m43275q(cursorM65531q, "requires_device_idle");
                int iM43275q28 = g0b1.m43275q(cursorM65531q, "requires_battery_not_low");
                int iM43275q29 = g0b1.m43275q(cursorM65531q, "requires_storage_not_low");
                int iM43275q30 = g0b1.m43275q(cursorM65531q, "trigger_content_update_delay");
                int iM43275q31 = g0b1.m43275q(cursorM65531q, "trigger_max_content_delay");
                int iM43275q32 = g0b1.m43275q(cursorM65531q, "content_uri_triggers");
                i1e1 i1e1Var = null;
                if (cursorM65531q.moveToFirst()) {
                    i1e1Var = new i1e1(cursorM65531q.getString(iM43275q), n0e1.m63398F(cursorM65531q.getInt(iM43275q2)), cursorM65531q.getString(iM43275q3), cursorM65531q.getString(iM43275q4), sco.m77812a(cursorM65531q.getBlob(iM43275q5)), sco.m77812a(cursorM65531q.getBlob(iM43275q6)), cursorM65531q.getLong(iM43275q7), cursorM65531q.getLong(iM43275q8), cursorM65531q.getLong(iM43275q9), new a8j(n0e1.m63416X(cursorM65531q.getBlob(iM43275q25)), n0e1.m63396D(cursorM65531q.getInt(iM43275q24)), cursorM65531q.getInt(iM43275q26) != 0, cursorM65531q.getInt(iM43275q27) != 0, cursorM65531q.getInt(iM43275q28) != 0, cursorM65531q.getInt(iM43275q29) != 0, cursorM65531q.getLong(iM43275q30), cursorM65531q.getLong(iM43275q31), n0e1.m63427e(cursorM65531q.getBlob(iM43275q32))), cursorM65531q.getInt(iM43275q10), n0e1.m63395C(cursorM65531q.getInt(iM43275q11)), cursorM65531q.getLong(iM43275q12), cursorM65531q.getLong(iM43275q13), cursorM65531q.getLong(iM43275q14), cursorM65531q.getLong(iM43275q15), cursorM65531q.getInt(iM43275q16) != 0, n0e1.m63397E(cursorM65531q.getInt(iM43275q17)), cursorM65531q.getInt(iM43275q18), cursorM65531q.getInt(iM43275q19), cursorM65531q.getLong(iM43275q20), cursorM65531q.getInt(iM43275q21), cursorM65531q.getInt(iM43275q22), cursorM65531q.isNull(iM43275q23) ? null : cursorM65531q.getString(iM43275q23));
                }
                cursorM65531q.close();
                ojx0Var.m67120a();
                return i1e1Var;
            } catch (Throwable th) {
                th = th;
                cursorM65531q.close();
                ojx0Var.m67120a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ojx0Var = ojx0VarM50495m;
        }
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m66060k(String str) {
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        ojx0VarM50495m.mo38269L0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
            while (cursorM65531q.moveToNext()) {
                arrayList.add(new g1e1(cursorM65531q.getString(0), n0e1.m63398F(cursorM65531q.getInt(1))));
            }
            cursorM65531q.close();
            ojx0VarM50495m.m67120a();
            return arrayList;
        } catch (Throwable th) {
            cursorM65531q.close();
            ojx0VarM50495m.m67120a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m66061l(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = this.f160723m;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        fa00VarM93329a.mo38272u(1, j);
        fa00VarM93329a.mo38269L0(2, str);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
            } catch (Throwable th) {
                workDatabase_Impl.m59184i();
                throw th;
            }
        } catch (Throwable th2) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m66062m(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = this.f160722l;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        fa00VarM93329a.mo38269L0(1, str);
        fa00VarM93329a.mo38272u(2, i);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
            } catch (Throwable th) {
                workDatabase_Impl.m59184i();
                throw th;
            }
        } catch (Throwable th2) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m66063n(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = this.f160719i;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        fa00VarM93329a.mo38272u(1, j);
        fa00VarM93329a.mo38269L0(2, str);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
            } catch (Throwable th) {
                workDatabase_Impl.m59184i();
                throw th;
            }
        } catch (Throwable th2) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m66064o(String str, sco scoVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = this.f160718h;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        sco scoVar2 = sco.f207772b;
        fa00VarM93329a.mo38271q(n0e1.m63412T(scoVar), 1);
        fa00VarM93329a.mo38269L0(2, str);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
            } catch (Throwable th) {
                workDatabase_Impl.m59184i();
                throw th;
            }
        } catch (Throwable th2) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m66065p(String str, h0e1 h0e1Var) {
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = this.f160715e;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        fa00VarM93329a.mo38272u(1, n0e1.m63410R(h0e1Var));
        fa00VarM93329a.mo38269L0(2, str);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
            } catch (Throwable th) {
                workDatabase_Impl.m59184i();
                throw th;
            }
        } catch (Throwable th2) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m66066q(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = this.f160725o;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        fa00VarM93329a.mo38272u(1, i);
        fa00VarM93329a.mo38269L0(2, str);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
            } catch (Throwable th) {
                workDatabase_Impl.m59184i();
                throw th;
            }
        } catch (Throwable th2) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th2;
        }
    }
}
