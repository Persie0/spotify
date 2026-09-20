package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import com.spotify.player.model.ContextTrack;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ptd0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<ptd0> CREATOR;

    /* JADX INFO: renamed from: L0 */
    public String f181105L0;

    /* JADX INFO: renamed from: M0 */
    public JSONObject f181106M0;

    /* JADX INFO: renamed from: N0 */
    public int f181107N0;

    /* JADX INFO: renamed from: P0 */
    public boolean f181109P0;

    /* JADX INFO: renamed from: Q0 */
    public nh0 f181110Q0;

    /* JADX INFO: renamed from: R0 */
    public iyb1 f181111R0;

    /* JADX INFO: renamed from: S0 */
    public khd0 f181112S0;

    /* JADX INFO: renamed from: T0 */
    public cld0 f181113T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f181114U0;

    /* JADX INFO: renamed from: X */
    public long[] f181116X;

    /* JADX INFO: renamed from: Y */
    public int f181117Y;

    /* JADX INFO: renamed from: Z */
    public int f181118Z;

    /* JADX INFO: renamed from: a */
    public MediaInfo f181119a;

    /* JADX INFO: renamed from: b */
    public long f181120b;

    /* JADX INFO: renamed from: c */
    public int f181121c;

    /* JADX INFO: renamed from: d */
    public double f181122d;

    /* JADX INFO: renamed from: e */
    public int f181123e;

    /* JADX INFO: renamed from: f */
    public int f181124f;

    /* JADX INFO: renamed from: g */
    public long f181125g;

    /* JADX INFO: renamed from: h */
    public long f181126h;

    /* JADX INFO: renamed from: i */
    public double f181127i;

    /* JADX INFO: renamed from: t */
    public boolean f181128t;

    /* JADX INFO: renamed from: O0 */
    public final ArrayList f181108O0 = new ArrayList();

    /* JADX INFO: renamed from: V0 */
    public final SparseArray f181115V0 = new SparseArray();

    static {
        ig31.m50503u("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new nlf1(6);
    }

    public ptd0(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, nh0 nh0Var, iyb1 iyb1Var, khd0 khd0Var, cld0 cld0Var) {
        this.f181119a = mediaInfo;
        this.f181120b = j;
        this.f181121c = i;
        this.f181122d = d;
        this.f181123e = i2;
        this.f181124f = i3;
        this.f181125g = j2;
        this.f181126h = j3;
        this.f181127i = d2;
        this.f181128t = z;
        this.f181116X = jArr;
        this.f181117Y = i4;
        this.f181118Z = i5;
        this.f181105L0 = str;
        if (str != null) {
            try {
                this.f181106M0 = new JSONObject(this.f181105L0);
            } catch (JSONException unused) {
                this.f181106M0 = null;
                this.f181105L0 = null;
            }
        } else {
            this.f181106M0 = null;
        }
        this.f181107N0 = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            m70930M(arrayList);
        }
        this.f181109P0 = z2;
        this.f181110Q0 = nh0Var;
        this.f181111R0 = iyb1Var;
        this.f181112S0 = khd0Var;
        this.f181113T0 = cld0Var;
        boolean z3 = false;
        if (cld0Var != null && cld0Var.f39255t) {
            z3 = true;
        }
        this.f181114U0 = z3;
    }

    /* JADX INFO: renamed from: M */
    public final void m70930M(List list) {
        ArrayList arrayList = this.f181108O0;
        arrayList.clear();
        SparseArray sparseArray = this.f181115V0;
        sparseArray.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                dld0 dld0Var = (dld0) list.get(i);
                arrayList.add(dld0Var);
                sparseArray.put(dld0Var.f50185b, Integer.valueOf(i));
            }
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof ptd0) {
                ptd0 ptd0Var = (ptd0) obj;
                if ((this.f181106M0 == null) == (ptd0Var.f181106M0 == null) && this.f181120b == ptd0Var.f181120b && this.f181121c == ptd0Var.f181121c && this.f181122d == ptd0Var.f181122d && this.f181123e == ptd0Var.f181123e && this.f181124f == ptd0Var.f181124f && this.f181125g == ptd0Var.f181125g && this.f181127i == ptd0Var.f181127i && this.f181128t == ptd0Var.f181128t && this.f181117Y == ptd0Var.f181117Y && this.f181118Z == ptd0Var.f181118Z && this.f181107N0 == ptd0Var.f181107N0 && Arrays.equals(this.f181116X, ptd0Var.f181116X) && acc.m25453c(Long.valueOf(this.f181126h), Long.valueOf(ptd0Var.f181126h)) && acc.m25453c(this.f181108O0, ptd0Var.f181108O0) && acc.m25453c(this.f181119a, ptd0Var.f181119a) && (((jSONObject = this.f181106M0) == null || (jSONObject2 = ptd0Var.f181106M0) == null || lm60.m59319a(jSONObject, jSONObject2)) && this.f181109P0 == ptd0Var.f181109P0 && acc.m25453c(this.f181110Q0, ptd0Var.f181110Q0) && acc.m25453c(this.f181111R0, ptd0Var.f181111R0) && acc.m25453c(this.f181112S0, ptd0Var.f181112S0) && mvl0.m62956s(this.f181113T0, ptd0Var.f181113T0) && this.f181114U0 == ptd0Var.f181114U0)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f181119a, Long.valueOf(this.f181120b), Integer.valueOf(this.f181121c), Double.valueOf(this.f181122d), Integer.valueOf(this.f181123e), Integer.valueOf(this.f181124f), Long.valueOf(this.f181125g), Long.valueOf(this.f181126h), Double.valueOf(this.f181127i), Boolean.valueOf(this.f181128t), Integer.valueOf(Arrays.hashCode(this.f181116X)), Integer.valueOf(this.f181117Y), Integer.valueOf(this.f181118Z), String.valueOf(this.f181106M0), Integer.valueOf(this.f181107N0), this.f181108O0, Boolean.valueOf(this.f181109P0), this.f181110Q0, this.f181111R0, this.f181112S0, this.f181113T0});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x01b0 A[EDGE_INSN: B:109:0x01b0->B:110:0x01b4 BREAK  A[LOOP:0: B:102:0x019c->B:106:0x01a9]] */
    /* JADX WARN: Code duplicated, block: B:147:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x024c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0252  */
    /* JADX WARN: Code duplicated, block: B:152:0x025c  */
    /* JADX WARN: Code duplicated, block: B:153:0x025f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0267  */
    /* JADX WARN: Code duplicated, block: B:157:0x026b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0272  */
    /* JADX WARN: Code duplicated, block: B:162:0x0284 A[LOOP:3: B:161:0x0282->B:162:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:168:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x0302  */
    /* JADX WARN: Code duplicated, block: B:182:0x0316  */
    /* JADX WARN: Code duplicated, block: B:183:0x0318  */
    /* JADX WARN: Code duplicated, block: B:185:0x0321  */
    /* JADX WARN: Code duplicated, block: B:187:0x0327  */
    /* JADX WARN: Code duplicated, block: B:188:0x032a  */
    /* JADX WARN: Code duplicated, block: B:191:0x033b  */
    /* JADX WARN: Code duplicated, block: B:245:0x0417 A[Catch: JSONException -> 0x0433, TRY_ENTER, TryCatch #1 {JSONException -> 0x0433, blocks: (B:223:0x03cf, B:246:0x0421, B:245:0x0417), top: B:376:0x03cf }] */
    /* JADX WARN: Code duplicated, block: B:296:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:314:0x0545  */
    /* JADX WARN: Code duplicated, block: B:317:0x0553  */
    /* JADX WARN: Code duplicated, block: B:319:0x055b  */
    /* JADX WARN: Code duplicated, block: B:320:0x056a  */
    /* JADX WARN: Code duplicated, block: B:323:0x0574  */
    /* JADX WARN: Code duplicated, block: B:326:0x0580  */
    /* JADX WARN: Code duplicated, block: B:327:0x0589  */
    /* JADX WARN: Code duplicated, block: B:355:0x0632  */
    /* JADX WARN: Code duplicated, block: B:357:0x063c  */
    /* JADX WARN: Code duplicated, block: B:367:0x0688  */
    /* JADX WARN: Code duplicated, block: B:369:0x068c  */
    /* JADX WARN: Code duplicated, block: B:394:0x030b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final int m70931k(JSONObject jSONObject, int i) {
        int i2;
        long[] jArr;
        boolean zM36354k;
        JSONArray jSONArray;
        int length;
        SparseArray sparseArray;
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z;
        Integer num;
        JSONObject jSONObject2;
        Integer num2;
        dld0 dld0Var;
        MediaInfo mediaInfo;
        Integer numM30610K;
        int iIntValue;
        nh0 nh0Var;
        int i5;
        iyb1 iyb1Var;
        int i6;
        JSONObject jSONObjectOptJSONObject;
        khd0 khd0Var;
        String strM25451a;
        int i7;
        String strM25451a2;
        String str;
        bld0 bld0Var;
        int iIntValue2;
        ArrayList arrayList2;
        int iOptInt;
        long jOptDouble;
        boolean zOptBoolean;
        int i8;
        ArrayList arrayList3;
        String str2;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList4;
        JSONArray jSONArrayOptJSONArray2;
        ArrayList arrayList5;
        int i9;
        JSONObject jSONObjectOptJSONObject2;
        MediaInfo mediaInfo2;
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObjectOptJSONObject3 = jSONObject3.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject3 != null) {
            try {
                ArrayList arrayList6 = new ArrayList();
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    arrayList6.add(itKeys.next());
                }
                JSONObject jSONObject4 = new JSONObject(jSONObject3, (String[]) arrayList6.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject4.put(next, jSONObjectOptJSONObject3.get(next));
                }
                jSONObject4.remove("extendedStatus");
                jSONObject3 = jSONObject4;
            } catch (JSONException unused) {
            }
        }
        long j = jSONObject3.getLong("mediaSessionId");
        int i13 = 1;
        if (j != this.f181120b) {
            this.f181120b = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i14 = 2;
        if (jSONObject3.has("playerState")) {
            String string = jSONObject3.getString("playerState");
            if (string.equals("IDLE")) {
                i11 = 1;
            } else if (string.equals("PLAYING")) {
                i11 = 2;
            } else if (string.equals("PAUSED")) {
                i11 = 3;
            } else if (string.equals("BUFFERING")) {
                i11 = 4;
            } else {
                i11 = string.equals("LOADING") ? 5 : 0;
            }
            if (i11 != this.f181123e) {
                this.f181123e = i11;
                i2 |= 2;
            }
            if (i11 == 1 && jSONObject3.has("idleReason")) {
                String string2 = jSONObject3.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i12 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i12 = 3;
                } else if (string2.equals("FINISHED")) {
                    i12 = 1;
                } else {
                    i12 = string2.equals(SearchEndpointResponseKt.RESULT_ERROR) ? 4 : 0;
                }
                if (i12 != this.f181124f) {
                    this.f181124f = i12;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject3.has("playbackRate")) {
            double d = jSONObject3.getDouble("playbackRate");
            if (this.f181122d != d) {
                this.f181122d = d;
                i2 |= 2;
            }
        }
        if (jSONObject3.has("currentTime")) {
            double d2 = jSONObject3.getDouble("currentTime");
            Pattern pattern = acc.f14312a;
            long j2 = (long) (d2 * 1000.0d);
            if (j2 != this.f181125g) {
                this.f181125g = j2;
                i2 |= 2;
            }
            i2 |= 128;
        }
        if (jSONObject3.has("supportedMediaCommands")) {
            long j3 = jSONObject3.getLong("supportedMediaCommands");
            if (j3 != this.f181126h) {
                this.f181126h = j3;
                i2 |= 2;
            }
        }
        if (jSONObject3.has("volume") && i == 0) {
            JSONObject jSONObject5 = jSONObject3.getJSONObject("volume");
            double d3 = jSONObject5.getDouble("level");
            if (d3 != this.f181127i) {
                this.f181127i = d3;
                i2 |= 2;
            }
            boolean z2 = jSONObject5.getBoolean("muted");
            if (z2 != this.f181128t) {
                this.f181128t = z2;
                i2 |= 2;
            }
        }
        JSONArray jSONArray2 = jSONObject3.has("activeTrackIds") ? jSONObject3.getJSONArray("activeTrackIds") : null;
        Pattern pattern2 = acc.f14312a;
        if (jSONArray2 == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray2.length()];
            for (int i15 = 0; i15 < jSONArray2.length(); i15++) {
                jArr[i15] = jSONArray2.getLong(i15);
            }
        }
        if (jArr != null) {
            long[] jArr2 = this.f181116X;
            if (jArr2 == null) {
                this.f181116X = jArr;
                i2 |= 2;
                break;
            }
            if (jArr2.length != jArr.length) {
                this.f181116X = jArr;
                i2 |= 2;
                break;
            }
            for (int i16 = 0; i16 < jArr.length; i16++) {
                if (this.f181116X[i16] != jArr[i16]) {
                    this.f181116X = jArr;
                    i2 |= 2;
                    break;
                }
            }
        } else if (this.f181116X != null) {
            this.f181116X = jArr;
            i2 |= 2;
            break;
        }
        if (jSONObject3.has("customData")) {
            this.f181106M0 = jSONObject3.getJSONObject("customData");
            this.f181105L0 = null;
            i2 |= 2;
        }
        if (jSONObject3.has("media")) {
            JSONObject jSONObject6 = jSONObject3.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject6);
            MediaInfo mediaInfo4 = this.f181119a;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.f181119a = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject6.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject3.has("currentItemId") && this.f181121c != (i10 = jSONObject3.getInt("currentItemId"))) {
            this.f181121c = i10;
            i2 |= 2;
        }
        int iOptInt2 = jSONObject3.optInt("preloadedItemId", 0);
        if (this.f181118Z != iOptInt2) {
            this.f181118Z = iOptInt2;
            i2 |= 16;
        }
        int iOptInt3 = jSONObject3.optInt("loadingItemId", 0);
        if (this.f181117Y != iOptInt3) {
            this.f181117Y = iOptInt3;
            i2 |= 2;
        }
        MediaInfo mediaInfo5 = this.f181119a;
        int i17 = mediaInfo5 == null ? -1 : mediaInfo5.f1796b;
        int i18 = this.f181123e;
        int i19 = this.f181124f;
        int i20 = this.f181117Y;
        ArrayList arrayList7 = this.f181108O0;
        SparseArray sparseArray2 = this.f181115V0;
        if (i18 != 1) {
            if (jSONObject3.has("repeatMode")) {
                numM30610K = bvg1.m30610K(jSONObject3.getString("repeatMode"));
                if (numM30610K == null) {
                    iIntValue = this.f181107N0;
                } else {
                    iIntValue = numM30610K.intValue();
                }
                if (this.f181107N0 != iIntValue) {
                    this.f181107N0 = iIntValue;
                    zM36354k = true;
                } else {
                    zM36354k = false;
                }
            } else {
                zM36354k = false;
            }
            if (jSONObject3.has("items")) {
                jSONArray = jSONObject3.getJSONArray("items");
                length = jSONArray.length();
                sparseArray = new SparseArray();
                i13 = 1;
                i3 = 0;
                while (i3 < length) {
                    sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                    i3++;
                    i14 = i14;
                }
                i14 = i14;
                arrayList = new ArrayList();
                for (i4 = 0; i4 < length; i4++) {
                    num = (Integer) sparseArray.get(i4);
                    jSONObject2 = jSONArray.getJSONObject(i4);
                    num2 = (Integer) sparseArray2.get(num.intValue());
                    if (num2 == null) {
                        dld0Var = null;
                    } else {
                        dld0Var = (dld0) arrayList7.get(num2.intValue());
                    }
                    if (dld0Var != null) {
                        zM36354k |= dld0Var.m36354k(jSONObject2);
                        arrayList.add(dld0Var);
                        if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                        }
                    } else if (num.intValue() == this.f181121c) {
                        arrayList.add(new dld0(jSONObject2));
                    } else {
                        arrayList.add(new dld0(jSONObject2));
                    }
                    zM36354k = true;
                }
                if (arrayList7.size() != length) {
                    z = false;
                } else {
                    z = true;
                }
                zM36354k |= !z;
                m70930M(arrayList);
            } else {
                i13 = 1;
                i14 = 2;
            }
            if (zM36354k) {
                i2 |= 8;
            }
        } else if (i19 != 1) {
            if (i19 != 2) {
                if (i19 == 3) {
                    if (i20 != 0) {
                        if (jSONObject3.has("repeatMode")) {
                            zM36354k = false;
                        } else {
                            numM30610K = bvg1.m30610K(jSONObject3.getString("repeatMode"));
                            if (numM30610K == null) {
                                iIntValue = this.f181107N0;
                            } else {
                                iIntValue = numM30610K.intValue();
                            }
                            if (this.f181107N0 != iIntValue) {
                                this.f181107N0 = iIntValue;
                                zM36354k = true;
                            } else {
                                zM36354k = false;
                            }
                        }
                        if (jSONObject3.has("items")) {
                            jSONArray = jSONObject3.getJSONArray("items");
                            length = jSONArray.length();
                            sparseArray = new SparseArray();
                            i13 = 1;
                            i3 = 0;
                            while (i3 < length) {
                                sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                                i3++;
                                i14 = i14;
                            }
                            i14 = i14;
                            arrayList = new ArrayList();
                            while (i4 < length) {
                                num = (Integer) sparseArray.get(i4);
                                jSONObject2 = jSONArray.getJSONObject(i4);
                                num2 = (Integer) sparseArray2.get(num.intValue());
                                if (num2 == null) {
                                    dld0Var = null;
                                } else {
                                    dld0Var = (dld0) arrayList7.get(num2.intValue());
                                }
                                if (dld0Var != null) {
                                    zM36354k |= dld0Var.m36354k(jSONObject2);
                                    arrayList.add(dld0Var);
                                    if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                                    }
                                } else if (num.intValue() == this.f181121c) {
                                    arrayList.add(new dld0(jSONObject2));
                                } else {
                                    arrayList.add(new dld0(jSONObject2));
                                }
                                zM36354k = true;
                            }
                            if (arrayList7.size() != length) {
                                z = false;
                            } else {
                                z = true;
                            }
                            zM36354k |= !z;
                            m70930M(arrayList);
                        } else {
                            i13 = 1;
                            i14 = 2;
                        }
                        if (zM36354k) {
                            i2 |= 8;
                        }
                    }
                }
                this.f181121c = r4;
                this.f181117Y = r4;
                this.f181118Z = r4;
                if (!arrayList7.isEmpty()) {
                    i2 |= 8;
                    this.f181107N0 = 0;
                    arrayList7.clear();
                    sparseArray2.clear();
                }
            } else if (i17 == 2) {
                if (jSONObject3.has("repeatMode")) {
                    zM36354k = false;
                } else {
                    numM30610K = bvg1.m30610K(jSONObject3.getString("repeatMode"));
                    if (numM30610K == null) {
                        iIntValue = this.f181107N0;
                    } else {
                        iIntValue = numM30610K.intValue();
                    }
                    if (this.f181107N0 != iIntValue) {
                        this.f181107N0 = iIntValue;
                        zM36354k = true;
                    } else {
                        zM36354k = false;
                    }
                }
                if (jSONObject3.has("items")) {
                    jSONArray = jSONObject3.getJSONArray("items");
                    length = jSONArray.length();
                    sparseArray = new SparseArray();
                    i13 = 1;
                    i3 = 0;
                    while (i3 < length) {
                        sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                        i3++;
                        i14 = i14;
                    }
                    i14 = i14;
                    arrayList = new ArrayList();
                    while (i4 < length) {
                        num = (Integer) sparseArray.get(i4);
                        jSONObject2 = jSONArray.getJSONObject(i4);
                        num2 = (Integer) sparseArray2.get(num.intValue());
                        if (num2 == null) {
                            dld0Var = null;
                        } else {
                            dld0Var = (dld0) arrayList7.get(num2.intValue());
                        }
                        if (dld0Var != null) {
                            zM36354k |= dld0Var.m36354k(jSONObject2);
                            arrayList.add(dld0Var);
                            if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                            }
                        } else if (num.intValue() == this.f181121c) {
                            arrayList.add(new dld0(jSONObject2));
                        } else {
                            arrayList.add(new dld0(jSONObject2));
                        }
                        zM36354k = true;
                    }
                    if (arrayList7.size() != length) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zM36354k |= !z;
                    m70930M(arrayList);
                } else {
                    i13 = 1;
                    i14 = 2;
                }
                if (zM36354k) {
                    i2 |= 8;
                }
            }
            this.f181121c = r4;
            this.f181117Y = r4;
            this.f181118Z = r4;
            if (!arrayList7.isEmpty()) {
                i2 |= 8;
                this.f181107N0 = 0;
                arrayList7.clear();
                sparseArray2.clear();
            }
        } else if (i20 != 0) {
            if (jSONObject3.has("repeatMode")) {
                zM36354k = false;
            } else {
                numM30610K = bvg1.m30610K(jSONObject3.getString("repeatMode"));
                if (numM30610K == null) {
                    iIntValue = this.f181107N0;
                } else {
                    iIntValue = numM30610K.intValue();
                }
                if (this.f181107N0 != iIntValue) {
                    this.f181107N0 = iIntValue;
                    zM36354k = true;
                } else {
                    zM36354k = false;
                }
            }
            if (jSONObject3.has("items")) {
                jSONArray = jSONObject3.getJSONArray("items");
                length = jSONArray.length();
                sparseArray = new SparseArray();
                i13 = 1;
                i3 = 0;
                while (i3 < length) {
                    sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                    i3++;
                    i14 = i14;
                }
                i14 = i14;
                arrayList = new ArrayList();
                while (i4 < length) {
                    num = (Integer) sparseArray.get(i4);
                    jSONObject2 = jSONArray.getJSONObject(i4);
                    num2 = (Integer) sparseArray2.get(num.intValue());
                    if (num2 == null) {
                        dld0Var = null;
                    } else {
                        dld0Var = (dld0) arrayList7.get(num2.intValue());
                    }
                    if (dld0Var != null) {
                        zM36354k |= dld0Var.m36354k(jSONObject2);
                        arrayList.add(dld0Var);
                        if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                        }
                    } else if (num.intValue() == this.f181121c || (mediaInfo = this.f181119a) == null) {
                        arrayList.add(new dld0(jSONObject2));
                    } else {
                        dld0 dld0VarM60958a = new m680(mediaInfo).m60958a();
                        dld0VarM60958a.m36354k(jSONObject2);
                        arrayList.add(dld0VarM60958a);
                    }
                    zM36354k = true;
                }
                if (arrayList7.size() != length) {
                    z = false;
                } else {
                    z = true;
                }
                zM36354k |= !z;
                m70930M(arrayList);
            } else {
                i13 = 1;
                i14 = 2;
            }
            if (zM36354k) {
                i2 |= 8;
            }
        } else {
            this.f181121c = r4;
            this.f181117Y = r4;
            this.f181118Z = r4;
            if (!arrayList7.isEmpty()) {
                i2 |= 8;
                this.f181107N0 = 0;
                arrayList7.clear();
                sparseArray2.clear();
            }
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("breakStatus");
        Parcelable.Creator<nh0> creator = nh0.CREATOR;
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("currentBreakTime") && jSONObjectOptJSONObject4.has("currentBreakClipTime")) {
            try {
                long j4 = jSONObjectOptJSONObject4.getLong("currentBreakTime");
                Pattern pattern3 = acc.f14312a;
                long j5 = j4 * 1000;
                long j6 = jSONObjectOptJSONObject4.getLong("currentBreakClipTime") * 1000;
                String strM25451a3 = acc.m25451a("breakId", jSONObjectOptJSONObject4);
                String strM25451a4 = acc.m25451a("breakClipId", jSONObjectOptJSONObject4);
                long jOptLong = jSONObjectOptJSONObject4.optLong("whenSkippable", -1L);
                if (jOptLong != -1) {
                    jOptLong *= 1000;
                }
                nh0Var = new nh0(j5, j6, jOptLong, strM25451a3, strM25451a4);
            } catch (JSONException unused2) {
                nh0.f153816f.m83850c("Error while creating an AdBreakClipInfo from JSON", new Object[0]);
                nh0Var = null;
            }
        } else {
            nh0Var = null;
        }
        nh0 nh0Var2 = this.f181110Q0;
        if ((nh0Var2 == null && nh0Var != null) || (nh0Var2 != null && !nh0Var2.equals(nh0Var))) {
            this.f181109P0 = (nh0Var == null || (nh0Var.f153819c == null && nh0Var.f153820d == null)) ? 0 : i13;
            this.f181110Q0 = nh0Var;
            i2 |= 32;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject3.optJSONObject("videoInfo");
        ura0 ura0Var = iyb1.f106929d;
        if (jSONObjectOptJSONObject5 == null) {
            iyb1Var = null;
        } else {
            try {
                String string3 = jSONObjectOptJSONObject5.getString("hdrType");
                int iHashCode = string3.hashCode();
                if (iHashCode != 3218) {
                    if (iHashCode != 103158) {
                        if (iHashCode != 113729) {
                            if (iHashCode == 99136405 && string3.equals("hdr10")) {
                                i5 = i14;
                            } else {
                                ura0Var.m83848a("Unknown HDR type: %s", string3);
                                i5 = 0;
                            }
                        } else if (string3.equals("sdr")) {
                            i5 = i13;
                        } else {
                            ura0Var.m83848a("Unknown HDR type: %s", string3);
                            i5 = 0;
                        }
                    } else if (string3.equals("hdr")) {
                        i5 = 4;
                    } else {
                        ura0Var.m83848a("Unknown HDR type: %s", string3);
                        i5 = 0;
                    }
                } else if (string3.equals("dv")) {
                    i5 = 3;
                } else {
                    ura0Var.m83848a("Unknown HDR type: %s", string3);
                    i5 = 0;
                }
                iyb1Var = new iyb1(jSONObjectOptJSONObject5.getInt("width"), jSONObjectOptJSONObject5.getInt("height"), i5);
            } catch (JSONException unused3) {
                ura0Var.m83849b("Error while creating a VideoInfo instance from JSON", new Object[0]);
                iyb1Var = null;
            }
        }
        iyb1 iyb1Var2 = this.f181111R0;
        if ((iyb1Var2 == null && iyb1Var != null) || (iyb1Var2 != null && !iyb1Var2.equals(iyb1Var))) {
            this.f181111R0 = iyb1Var;
            i2 |= 64;
        }
        if (jSONObject3.has("breakInfo") && (mediaInfo2 = this.f181119a) != null) {
            mediaInfo2.m1487k(jSONObject3.getJSONObject("breakInfo"));
            i2 |= 2;
        }
        if (jSONObject3.has("queueData")) {
            JSONObject jSONObject7 = jSONObject3.getJSONObject("queueData");
            if (jSONObject7 == null) {
                i2 = i2;
                jOptDouble = -1;
                bld0Var = null;
                i8 = 0;
                iIntValue2 = 0;
                iOptInt = 0;
                zOptBoolean = false;
                str2 = null;
                arrayList3 = null;
                strM25451a2 = null;
                strM25451a = null;
            } else {
                String strM25451a5 = acc.m25451a("id", jSONObject7);
                strM25451a = acc.m25451a("entity", jSONObject7);
                switch (jSONObject7.optString("queueType")) {
                    case "PODCAST_SERIES":
                        i7 = 5;
                        break;
                    case "RADIO_STATION":
                        i7 = 4;
                        break;
                    case "PLAYLIST":
                        i7 = i14;
                        break;
                    case "AUDIOBOOK":
                        i7 = 3;
                        break;
                    case "TV_SERIES":
                        i7 = 6;
                        break;
                    case "ALBUM":
                        i7 = i13;
                        break;
                    case "MOVIE":
                        i7 = 9;
                        break;
                    case "VIDEO_PLAYLIST":
                        i7 = 7;
                        break;
                    case "LIVE_TV":
                        i7 = 8;
                        break;
                    default:
                        i7 = 0;
                        break;
                }
                strM25451a2 = acc.m25451a("name", jSONObject7);
                JSONObject jSONObjectOptJSONObject6 = jSONObject7.has("containerMetadata") ? jSONObject7.optJSONObject("containerMetadata") : null;
                if (jSONObjectOptJSONObject6 != null) {
                    String strOptString = jSONObjectOptJSONObject6.optString("containerType", "");
                    int iHashCode2 = strOptString.hashCode();
                    if (iHashCode2 == 6924225) {
                        int i21 = strOptString.equals("AUDIOBOOK_CONTAINER") ? i13 : 0;
                        String strM25451a6 = acc.m25451a(ContextTrack.Metadata.KEY_TITLE, jSONObjectOptJSONObject6);
                        jSONArrayOptJSONArray = jSONObjectOptJSONObject6.optJSONArray("sections");
                        if (jSONArrayOptJSONArray != null) {
                            arrayList4 = new ArrayList();
                            i9 = 0;
                            while (i9 < jSONArrayOptJSONArray.length()) {
                                jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i9);
                                int i22 = i9;
                                if (jSONObjectOptJSONObject2 != null) {
                                    ohd0 ohd0Var = new ohd0(0);
                                    ohd0Var.m66965M(jSONObjectOptJSONObject2);
                                    arrayList4.add(ohd0Var);
                                }
                                i9 = i22 + 1;
                                strM25451a5 = strM25451a5;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        str = strM25451a5;
                        jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("containerImages");
                        if (jSONArrayOptJSONArray2 != null) {
                            arrayList5 = new ArrayList();
                            m6f1.m61011a(arrayList5, jSONArrayOptJSONArray2);
                        } else {
                            arrayList5 = null;
                        }
                        double dOptDouble = jSONObjectOptJSONObject6.optDouble("containerDuration", 0.0d);
                        bld0Var = new bld0();
                        bld0Var.f28169a = i21;
                        bld0Var.f28170b = strM25451a6;
                        bld0Var.f28171c = arrayList4;
                        bld0Var.f28172d = arrayList5;
                        bld0Var.f28173e = dOptDouble;
                    } else if (iHashCode2 == 828666841) {
                        strOptString.equals("GENERIC_CONTAINER");
                    }
                    String strM25451a7 = acc.m25451a(ContextTrack.Metadata.KEY_TITLE, jSONObjectOptJSONObject6);
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject6.optJSONArray("sections");
                    if (jSONArrayOptJSONArray != null) {
                        arrayList4 = new ArrayList();
                        i9 = 0;
                        while (i9 < jSONArrayOptJSONArray.length()) {
                            jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i9);
                            int i23 = i9;
                            if (jSONObjectOptJSONObject2 != null) {
                                ohd0 ohd0Var2 = new ohd0(0);
                                ohd0Var2.m66965M(jSONObjectOptJSONObject2);
                                arrayList4.add(ohd0Var2);
                            }
                            i9 = i23 + 1;
                            strM25451a5 = strM25451a5;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    str = strM25451a5;
                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("containerImages");
                    if (jSONArrayOptJSONArray2 != null) {
                        arrayList5 = new ArrayList();
                        m6f1.m61011a(arrayList5, jSONArrayOptJSONArray2);
                    } else {
                        arrayList5 = null;
                    }
                    double dOptDouble2 = jSONObjectOptJSONObject6.optDouble("containerDuration", 0.0d);
                    bld0Var = new bld0();
                    bld0Var.f28169a = i21;
                    bld0Var.f28170b = strM25451a7;
                    bld0Var.f28171c = arrayList4;
                    bld0Var.f28172d = arrayList5;
                    bld0Var.f28173e = dOptDouble2;
                } else {
                    i2 = i2;
                    str = strM25451a5;
                    bld0Var = null;
                }
                Integer numM30610K2 = bvg1.m30610K(jSONObject7.optString("repeatMode"));
                iIntValue2 = numM30610K2 != null ? numM30610K2.intValue() : 0;
                JSONArray jSONArrayOptJSONArray3 = jSONObject7.optJSONArray("items");
                if (jSONArrayOptJSONArray3 != null) {
                    arrayList2 = new ArrayList();
                    for (int i24 = 0; i24 < jSONArrayOptJSONArray3.length(); i24++) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray3.optJSONObject(i24);
                        if (jSONObjectOptJSONObject7 != null) {
                            try {
                                arrayList2.add(new dld0(jSONObjectOptJSONObject7));
                            } catch (JSONException unused4) {
                            }
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                iOptInt = jSONObject7.optInt("startIndex", 0);
                jOptDouble = jSONObject7.has("startTime") ? (long) (jSONObject7.optDouble("startTime", -1L) * 1000.0d) : -1L;
                ArrayList arrayList8 = arrayList2;
                zOptBoolean = jSONObject7.optBoolean("shuffle");
                i8 = i7;
                arrayList3 = arrayList8;
                str2 = str;
            }
            cld0 cld0Var = new cld0();
            cld0Var.f39246a = str2;
            cld0Var.f39247b = strM25451a;
            cld0Var.f39248c = i8;
            cld0Var.f39249d = strM25451a2;
            cld0Var.f39250e = bld0Var;
            cld0Var.f39251f = iIntValue2;
            cld0Var.f39252g = arrayList3;
            cld0Var.f39253h = iOptInt;
            cld0Var.f39254i = jOptDouble;
            cld0Var.f39255t = zOptBoolean;
            this.f181113T0 = cld0Var;
            if (this.f181114U0 != zOptBoolean) {
                this.f181114U0 = zOptBoolean;
                i6 = i2 | 8;
            }
            if (jSONObject3.has("liveSeekableRange")) {
                i6 |= 2;
                jSONObjectOptJSONObject = jSONObject3.optJSONObject("liveSeekableRange");
                Parcelable.Creator<khd0> creator2 = khd0.CREATOR;
                if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject.has("start") && jSONObjectOptJSONObject.has("end")) {
                    try {
                        double d4 = jSONObjectOptJSONObject.getDouble("start");
                        Pattern pattern4 = acc.f14312a;
                        khd0Var = new khd0((long) (d4 * 1000.0d), (long) (jSONObjectOptJSONObject.getDouble("end") * 1000.0d), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                    } catch (JSONException unused5) {
                        khd0.f122612e.m83850c("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObjectOptJSONObject.toString()), new Object[0]);
                        khd0Var = null;
                    }
                } else {
                    khd0Var = null;
                }
                this.f181112S0 = khd0Var;
            } else {
                if (this.f181112S0 != null) {
                    i6 |= 2;
                }
                this.f181112S0 = null;
            }
            return i6;
        }
        i2 = i2;
        i6 = i2;
        if (jSONObject3.has("liveSeekableRange")) {
            i6 |= 2;
            jSONObjectOptJSONObject = jSONObject3.optJSONObject("liveSeekableRange");
            Parcelable.Creator<khd0> creator3 = khd0.CREATOR;
            if (jSONObjectOptJSONObject == null) {
                khd0Var = null;
            } else {
                double d5 = jSONObjectOptJSONObject.getDouble("start");
                Pattern pattern5 = acc.f14312a;
                khd0Var = new khd0((long) (d5 * 1000.0d), (long) (jSONObjectOptJSONObject.getDouble("end") * 1000.0d), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
            }
            this.f181112S0 = khd0Var;
        } else {
            if (this.f181112S0 != null) {
                i6 |= 2;
            }
            this.f181112S0 = null;
        }
        return i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f181106M0;
        this.f181105L0 = jSONObject == null ? null : jSONObject.toString();
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26307M(parcel, 2, this.f181119a, i);
        long j = this.f181120b;
        alf1.m26313S(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.f181121c;
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.f181122d;
        alf1.m26313S(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.f181123e;
        alf1.m26313S(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f181124f;
        alf1.m26313S(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.f181125g;
        alf1.m26313S(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.f181126h;
        alf1.m26313S(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.f181127i;
        alf1.m26313S(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.f181128t;
        alf1.m26313S(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        alf1.m26306L(parcel, 12, this.f181116X);
        int i5 = this.f181117Y;
        alf1.m26313S(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.f181118Z;
        alf1.m26313S(parcel, 14, 4);
        parcel.writeInt(i6);
        alf1.m26308N(parcel, 15, this.f181105L0);
        int i7 = this.f181107N0;
        alf1.m26313S(parcel, 16, 4);
        parcel.writeInt(i7);
        alf1.m26312R(parcel, 17, this.f181108O0);
        boolean z2 = this.f181109P0;
        alf1.m26313S(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        alf1.m26307M(parcel, 19, this.f181110Q0, i);
        alf1.m26307M(parcel, 20, this.f181111R0, i);
        alf1.m26307M(parcel, 21, this.f181112S0, i);
        alf1.m26307M(parcel, 22, this.f181113T0, i);
        alf1.m26316V(iM26314T, parcel);
    }
}
