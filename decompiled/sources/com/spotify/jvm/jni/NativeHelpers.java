package com.spotify.jvm.jni;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.bk5;
import p204p.n0e1;
import p204p.s571;
import p204p.vuc;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/jvm/jni/NativeHelpers;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_jvm_jni-jni"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeHelpers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/jvm/jni/NativeHelpers$Companion;", "", "<init>", "()V", "", "bytes", "", "offset", "nextNull", "([BI)I", "Ljava/io/ByteArrayOutputStream;", "outputStream", "", "string", "Lp/w2a1;", "writeStringToStream", "(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V", "", "byteArrayToMap", "([B)Ljava/util/Map;", "map", "mapToByteArray", "(Ljava/util/Map;)[B", "src_main_java_com_spotify_jvm_jni-jni"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int nextNull(byte[] bytes, int offset) {
            while (bytes[offset] != 0) {
                try {
                    offset++;
                } catch (Exception unused) {
                    throw new IndexOutOfBoundsException(s571.m77246e(offset, "Invalid character found at offset "));
                }
            }
            return offset;
        }

        private final void writeStringToStream(ByteArrayOutputStream outputStream, String string) throws IOException {
            outputStream.write(string.getBytes(vuc.f244913a));
            outputStream.write(0);
        }

        public final Map<String, String> byteArrayToMap(byte[] bytes) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (bytes != null) {
                int i = 0;
                while (i < bytes.length) {
                    int iNextNull = nextNull(bytes, i);
                    byte[] bArrM29601X0 = bk5.m29601X0(bytes, n0e1.m63417Y(i, iNextNull));
                    Charset charset = vuc.f244913a;
                    String str = new String(bArrM29601X0, charset);
                    int i2 = iNextNull + 1;
                    int iNextNull2 = nextNull(bytes, i2);
                    String str2 = new String(bk5.m29601X0(bytes, n0e1.m63417Y(i2, iNextNull2)), charset);
                    i = iNextNull2 + 1;
                    linkedHashMap.put(str, str2);
                }
            }
            return linkedHashMap;
        }

        public final byte[] mapToByteArray(Map<String, String> map) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    Companion companion = NativeHelpers.INSTANCE;
                    companion.writeStringToStream(byteArrayOutputStream, key);
                    companion.writeStringToStream(byteArrayOutputStream, value);
                }
            }
            return byteArrayOutputStream.toByteArray();
        }

        private Companion() {
        }
    }

    private NativeHelpers() {
    }

    public static final Map<String, String> byteArrayToMap(byte[] bArr) {
        return INSTANCE.byteArrayToMap(bArr);
    }

    public static final byte[] mapToByteArray(Map<String, String> map) {
        return INSTANCE.mapToByteArray(map);
    }
}
