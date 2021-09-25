#! eqela ss-0.26
#

lib sling-tools:0.70.0
import sling.tools.compiler
return SlingCompilerTool.forWebApplicationDirectory("backend", "static", [ "frontend" ]).executeScript(args)
