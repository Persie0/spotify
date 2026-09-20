package io.ably.lib.types;

import java.security.NoSuchAlgorithmException;
import java.util.Map;
import p204p.hyl;
import p204p.kyl;
import p204p.vx8;

/* JADX INFO: loaded from: classes16.dex */
public class ChannelOptions {
    public Object cipherParams;
    public boolean encrypted;
    public ChannelMode[] modes;
    public Map<String, String> params;

    @Deprecated
    public static ChannelOptions fromCipherKey(byte[] bArr) {
        return withCipherKey(bArr);
    }

    public static ChannelOptions withCipherKey(byte[] bArr) {
        hyl hylVar;
        ChannelOptions channelOptions = new ChannelOptions();
        channelOptions.encrypted = true;
        try {
            byte[] bArr2 = new byte[16];
            kyl.f127885b.nextBytes(bArr2);
            hylVar = new hyl("aes", bArr, bArr2);
        } catch (NoSuchAlgorithmException unused) {
            hylVar = null;
        }
        channelOptions.cipherParams = hylVar;
        return channelOptions;
    }

    public synchronized hyl getCipherParamsOrDefault() {
        hyl hylVarM57720a;
        hylVarM57720a = kyl.m57720a(this.cipherParams);
        if (this.cipherParams == null) {
            this.cipherParams = hylVarM57720a;
        }
        return hylVarM57720a;
    }

    public int getModeFlags() {
        int mask = 0;
        for (ChannelMode channelMode : this.modes) {
            mask |= channelMode.getMask();
        }
        return mask;
    }

    public boolean hasModes() {
        ChannelMode[] channelModeArr = this.modes;
        return (channelModeArr == null || channelModeArr.length == 0) ? false : true;
    }

    public boolean hasParams() {
        Map<String, String> map = this.params;
        return (map == null || map.isEmpty()) ? false : true;
    }

    @Deprecated
    public static ChannelOptions fromCipherKey(String str) {
        return fromCipherKey(vx8.m86642a(str));
    }

    public static ChannelOptions withCipherKey(String str) {
        return withCipherKey(vx8.m86642a(str));
    }
}
