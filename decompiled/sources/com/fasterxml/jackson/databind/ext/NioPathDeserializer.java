package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import p196j$.nio.file.Path;

/* JADX INFO: loaded from: classes3.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    private static final boolean areWindowsFilePathsSupported;

    static {
        boolean z = false;
        for (File file : File.listRoots()) {
            String path = file.getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
        }
        areWindowsFilePathsSupported = z;
    }

    public NioPathDeserializer() {
        super(Path.class);
    }
}
