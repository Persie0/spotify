package com.spotify.hubs.model.immutable;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import p204p.br30;
import p204p.dr30;
import p204p.fr30;
import p204p.gh00;
import p204p.gr30;
import p204p.hr30;
import p204p.ir30;
import p204p.jr30;
import p204p.kr30;
import p204p.lr30;
import p204p.mr30;
import p204p.mz20;
import p204p.vj30;
import p204p.wj30;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0003QMRB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010$2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010$2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0;H\u0016¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000eH\u0016¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020\u001e2\b\u0010I\u001a\u0004\u0018\u00010>H\u0096\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000eH\u0016¢\u0006\u0004\bL\u0010HR\u0018\u0010N\u001a\u00060MR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006S"}, m24212d2 = {"Lcom/spotify/hubs/model/immutable/HubsImmutableComponentBundle;", "Lp/wj30;", "Landroid/os/Parcelable;", "<init>", "()V", "Lp/vj30;", "toBuilder", "()Lp/vj30;", "", "key", "string", "(Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "intValue", "(Ljava/lang/String;I)I", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "longValue", "(Ljava/lang/String;J)J", "(Ljava/lang/String;)Ljava/lang/Long;", "", "floatValue", "(Ljava/lang/String;F)F", "(Ljava/lang/String;)Ljava/lang/Float;", "", "doubleValue", "(Ljava/lang/String;D)D", "(Ljava/lang/String;)Ljava/lang/Double;", "", "boolValue", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;)Ljava/lang/Boolean;", "bundle", "(Ljava/lang/String;)Lp/wj30;", "", "stringArray", "(Ljava/lang/String;)[Ljava/lang/String;", "", "intArray", "(Ljava/lang/String;)[I", "", "byteArray", "(Ljava/lang/String;)[B", "", "longArray", "(Ljava/lang/String;)[J", "", "floatArray", "(Ljava/lang/String;)[F", "", "doubleArray", "(Ljava/lang/String;)[D", "bundleArray", "(Ljava/lang/String;)[Lp/wj30;", "", "boolArray", "(Ljava/lang/String;)[Z", "", "keySet", "()Ljava/util/Set;", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "Landroid/os/Parcel;", "parcel", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lp/dr30;", "impl", "Lp/dr30;", "Companion", "p/er30", "p/br30", "src_main_java_com_spotify_hubs_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class HubsImmutableComponentBundle implements wj30, Parcelable {
    private final dr30 impl;
    public static final br30 Companion = new br30();
    private static final HubsImmutableComponentBundle EMPTY = br30.m30288d();
    public static final Parcelable.Creator<HubsImmutableComponentBundle> CREATOR = new mz20(15);

    public HubsImmutableComponentBundle() {
        this(new Bundle());
    }

    public static final vj30 builder() {
        Companion.getClass();
        return br30.m30287c();
    }

    public static final HubsImmutableComponentBundle create() {
        Companion.getClass();
        return br30.m30288d();
    }

    public static final HubsImmutableComponentBundle fromNullable(wj30 wj30Var) {
        Companion.getClass();
        return br30.m30289e(wj30Var);
    }

    public boolean[] boolArray(String key) {
        return (boolean[]) m11896g(boolean[].class, key);
    }

    @Override // p204p.wj30
    public boolean boolValue(String key, boolean defaultValue) {
        Boolean bool = (Boolean) m11896g(Boolean.class, key);
        return bool != null ? bool.booleanValue() : defaultValue;
    }

    @Override // p204p.wj30
    public wj30 bundle(String key) {
        return (wj30) m11896g(wj30.class, key);
    }

    @Override // p204p.wj30
    public wj30[] bundleArray(String key) {
        return (wj30[]) m11896g(wj30[].class, key);
    }

    public byte[] byteArray(String key) {
        return (byte[]) m11896g(byte[].class, key);
    }

    /* JADX INFO: renamed from: c */
    public final Number m11895c(String str, gh00 gh00Var) {
        Number number = (Number) m11896g(Number.class, str);
        if (number != null) {
            return (Number) gh00Var.invoke(number);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double[] doubleArray(String key) {
        return (double[]) m11896g(double[].class, key);
    }

    public double doubleValue(String key, double defaultValue) {
        Double d = (Double) m11895c(key, fr30.f72346h);
        return d != null ? d.doubleValue() : defaultValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubsImmutableComponentBundle)) {
            return false;
        }
        Bundle bundleM36703u = this.impl.m36703u();
        Bundle bundleM36703u2 = ((HubsImmutableComponentBundle) other).impl.m36703u();
        if (!wj50.m88271j(bundleM36703u.keySet(), bundleM36703u2.keySet())) {
            return false;
        }
        for (String str : bundleM36703u.keySet()) {
            Object obj = bundleM36703u.get(str);
            if (obj == null) {
                if (bundleM36703u2.get(str) != null) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                if (!br30.m30285a(Companion, obj, bundleM36703u2.get(str))) {
                    return false;
                }
            } else if (!obj.equals(bundleM36703u2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public float[] floatArray(String key) {
        return (float[]) m11896g(float[].class, key);
    }

    public float floatValue(String key, float defaultValue) {
        Float f = (Float) m11895c(key, hr30.f94330h);
        return f != null ? f.floatValue() : defaultValue;
    }

    /* JADX INFO: renamed from: g */
    public final Object m11896g(Class cls, String str) {
        Object obj = this.impl.m36703u().get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    @Override // p204p.wj30
    public Object get(String key) {
        return this.impl.m36703u().get(key);
    }

    public int hashCode() {
        int iM30286b;
        Iterator<String> it = keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = get(it.next());
            if (obj == null) {
                iM30286b = 0;
            } else {
                iM30286b = obj.getClass().isArray() ? br30.m30286b(Companion, obj) : obj.hashCode();
            }
            i = (i * 31) + iM30286b;
        }
        return i;
    }

    public int[] intArray(String key) {
        return (int[]) m11896g(int[].class, key);
    }

    @Override // p204p.wj30
    public int intValue(String key, int defaultValue) {
        Integer num = (Integer) m11895c(key, jr30.f115071h);
        return num != null ? num.intValue() : defaultValue;
    }

    @Override // p204p.wj30
    public Set<String> keySet() {
        return this.impl.m36703u().keySet();
    }

    public long[] longArray(String key) {
        return (long[]) m11896g(long[].class, key);
    }

    @Override // p204p.wj30
    public long longValue(String key, long defaultValue) {
        Long l = (Long) m11895c(key, lr30.f136214h);
        return l != null ? l.longValue() : defaultValue;
    }

    @Override // p204p.wj30
    public String string(String key) {
        return (String) m11896g(String.class, key);
    }

    @Override // p204p.wj30
    public String[] stringArray(String key) {
        return (String[]) m11896g(String[].class, key);
    }

    @Override // p204p.wj30
    public vj30 toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeBundle(this.impl.m36703u());
    }

    public HubsImmutableComponentBundle(Bundle bundle) {
        this.impl = new dr30(this, bundle);
    }

    @Override // p204p.wj30
    public Boolean boolValue(String key) {
        return (Boolean) m11896g(Boolean.class, key);
    }

    @Override // p204p.wj30
    public Double doubleValue(String key) {
        return (Double) m11895c(key, gr30.f83608h);
    }

    public Float floatValue(String key) {
        return (Float) m11895c(key, ir30.f104906h);
    }

    @Override // p204p.wj30
    public Integer intValue(String key) {
        return (Integer) m11895c(key, kr30.f125535h);
    }

    @Override // p204p.wj30
    public Long longValue(String key) {
        return (Long) m11895c(key, mr30.f146413h);
    }

    @Override // p204p.wj30
    public String string(String key, String defaultValue) {
        String str = (String) m11896g(String.class, key);
        return str == null ? defaultValue : str;
    }

    public HubsImmutableComponentBundle(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.impl = hubsImmutableComponentBundle.impl;
    }
}
