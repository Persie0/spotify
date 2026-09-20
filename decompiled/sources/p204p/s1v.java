package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s1v implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f204804a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f204805b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final String f204806c;

    /* JADX INFO: renamed from: d */
    public final a32 f204807d;

    /* JADX INFO: renamed from: e */
    public final r4r f204808e;

    public s1v(String str, SharedPreferences sharedPreferences, a32 a32Var, r4r r4rVar) {
        this.f204806c = str;
        this.f204804a = sharedPreferences;
        this.f204807d = a32Var;
        this.f204808e = r4rVar;
    }

    /* JADX INFO: renamed from: a */
    public static s1v m76988a(Context context, String str, C2617yl c2617yl, q1v q1vVar, r1v r1vVar) {
        String str2 = c2617yl.f273869b;
        int i = s4r.f205633a;
        l32.m57970b0();
        qsv0.m73768g(new u4r());
        b32.m27983a();
        Context applicationContext = context.getApplicationContext();
        obf0 obf0Var = new obf0();
        obf0Var.m66656n(q1vVar.f184412a);
        obf0Var.m66658p(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        obf0Var.m66657o("android-keystore://" + str2);
        u6x u6xVarM77262f = obf0Var.m66646c().m77262f();
        obf0 obf0Var2 = new obf0();
        obf0Var2.m66656n(r1vVar.f194927a);
        obf0Var2.m66658p(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        obf0Var2.m66657o("android-keystore://" + str2);
        u6x u6xVarM77262f2 = obf0Var2.m66646c().m77262f();
        return new s1v(str, applicationContext.getSharedPreferences(str, 0), (a32) u6xVarM77262f2.m82472o(a32.class), (r4r) u6xVarM77262f.m82472o(r4r.class));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m76989d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    /* JADX INFO: renamed from: b */
    public final String m76990b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return ux8.m84138b(this.f204808e.mo55323a(str.getBytes(StandardCharsets.UTF_8), this.f204806c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m76991c(String str) {
        if (m76989d(str)) {
            throw new SecurityException(s571.m77250i(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM76990b = m76990b(str);
            String string = this.f204804a.getString(strM76990b, null);
            if (string != null) {
                byte[] bArrM84137a = ux8.m84137a(string);
                a32 a32Var = this.f204807d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(a32Var.mo24593b(bArrM84137a, strM76990b.getBytes(charset)));
                byteBufferWrap.position(0);
                int iM38547C = edb.m38547C(p1v.m68848e(byteBufferWrap.getInt()));
                if (iM38547C == 0) {
                    int i = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else if (iM38547C == 1) {
                    zj5 zj5Var = new zj5(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i2 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i2);
                        byteBufferWrap.position(byteBufferWrap.position() + i2);
                        zj5Var.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (zj5Var.f283362c != 1 || !"__NULL__".equals(zj5Var.f283361b[0])) {
                        return zj5Var;
                    }
                } else {
                    if (iM38547C == 2) {
                        return Integer.valueOf(byteBufferWrap.getInt());
                    }
                    if (iM38547C == 3) {
                        return Long.valueOf(byteBufferWrap.getLong());
                    }
                    if (iM38547C == 4) {
                        return Float.valueOf(byteBufferWrap.getFloat());
                    }
                    if (iM38547C == 5) {
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (m76989d(str)) {
            throw new SecurityException(s571.m77250i(str, " is a reserved key for the encryption keyset."));
        }
        return this.f204804a.contains(m76990b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new o1v(this, this.f204804a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f204804a.getAll().entrySet()) {
            if (!m76989d(entry.getKey())) {
                try {
                    String str = new String(this.f204808e.mo55324b(ux8.m84137a(entry.getKey()), this.f204806c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, m76991c(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objM76991c = m76991c(str);
        return (objM76991c == null || !(objM76991c instanceof Boolean)) ? z : ((Boolean) objM76991c).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objM76991c = m76991c(str);
        return (objM76991c == null || !(objM76991c instanceof Float)) ? f : ((Float) objM76991c).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objM76991c = m76991c(str);
        return (objM76991c == null || !(objM76991c instanceof Integer)) ? i : ((Integer) objM76991c).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objM76991c = m76991c(str);
        return (objM76991c == null || !(objM76991c instanceof Long)) ? j : ((Long) objM76991c).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objM76991c = m76991c(str);
        return (objM76991c == null || !(objM76991c instanceof String)) ? str2 : (String) objM76991c;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objM76991c = m76991c(str);
        Set zj5Var = objM76991c instanceof Set ? (Set) objM76991c : new zj5(0);
        return zj5Var.size() > 0 ? zj5Var : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f204805b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f204805b.remove(onSharedPreferenceChangeListener);
    }
}
