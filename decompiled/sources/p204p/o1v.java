package p204p;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o1v implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public final s1v f160864a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences.Editor f160865b;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f160867d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f160866c = new CopyOnWriteArrayList();

    public o1v(s1v s1vVar, SharedPreferences.Editor editor) {
        this.f160864a = s1vVar;
        this.f160865b = editor;
    }

    /* JADX INFO: renamed from: a */
    public final void m66080a() {
        if (this.f160867d.getAndSet(false)) {
            s1v s1vVar = this.f160864a;
            for (String str : ((HashMap) s1vVar.getAll()).keySet()) {
                if (!this.f160866c.contains(str) && !s1v.m76989d(str)) {
                    this.f160865b.remove(s1vVar.m76990b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        m66080a();
        this.f160865b.apply();
        m66081b();
        this.f160866c.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m66081b() {
        s1v s1vVar = this.f160864a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : s1vVar.f204805b) {
            Iterator it = this.f160866c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(s1vVar, (String) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m66082c(String str, byte[] bArr) {
        s1v s1vVar = this.f160864a;
        s1vVar.getClass();
        if (s1v.m76989d(str)) {
            throw new SecurityException(s571.m77250i(str, " is a reserved key for the encryption keyset."));
        }
        this.f160866c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM76990b = s1vVar.m76990b(str);
            Pair pair = new Pair(strM76990b, ux8.m84138b(s1vVar.f204807d.mo24592a(bArr, strM76990b.getBytes(StandardCharsets.UTF_8))));
            this.f160865b.putString((String) pair.first, (String) pair.second);
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f160867d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f160866c;
        m66080a();
        try {
            return this.f160865b.commit();
        } finally {
            m66081b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(p1v.m68849f(6));
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        m66082c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(p1v.m68849f(5));
        byteBufferAllocate.putFloat(f);
        m66082c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(p1v.m68849f(3));
        byteBufferAllocate.putInt(i);
        m66082c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(p1v.m68849f(4));
        byteBufferAllocate.putLong(j);
        m66082c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(p1v.m68849f(1));
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        m66082c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new zj5(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(p1v.m68849f(2));
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        m66082c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        s1v s1vVar = this.f160864a;
        s1vVar.getClass();
        if (s1v.m76989d(str)) {
            throw new SecurityException(s571.m77250i(str, " is a reserved key for the encryption keyset."));
        }
        this.f160865b.remove(s1vVar.m76990b(str));
        this.f160866c.remove(str);
        return this;
    }
}
